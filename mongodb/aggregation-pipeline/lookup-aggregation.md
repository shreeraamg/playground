## $lookup Stage in Aggregation

Consider the below order and customer data.

**Order**

```json
{
  "_id": "ORD001",
  "customerId": "CUST001",
  "orderDate": { "$date": "2025-01-05T09:30:00.000Z" },
  "status": "Delivered",
  "paymentMethod": "Credit Card",
  "items": [
    {
      "productId": "PROD1001",
      "quantity": 2,
      "price": 25.99
    },
    {
      "productId": "PROD1004",
      "quantity": 1,
      "price": 14.49
    }
  ],
  "total": 66.47
}
```

**Customer**

```json
{
  "_id": "CUST001",
  "name": "John Doe",
  "email": "johndoe@email.com",
  "address": {
    "street": "123 Maple Street",
    "city": "Springfield",
    "state": "IL",
    "postalCode": "62704",
    "country": "USA"
  }
}
```

If we lookup (join) customer with the orders table using the following command
```shell
db.orders.aggregate([
  $lookup: {
    from: "customers",
    localField: "customerId",
    foreignField: "_id",
    as: "customerDetails"
  },
  { $unwind: "$customerDetails" }
])
```

The output will be:

```json
{
  "_id": "ORD001",
  "customerId": "CUST001",
  "orderDate": {
    "$date": "2025-01-05T09:30:00.000Z"
  },
  "status": "Delivered",
  "paymentMethod": "Credit Card",
  "items": [
    {
      "productId": "PROD1001",
      "quantity": 2,
      "price": 25.99
    },
    {
      "productId": "PROD1004",
      "quantity": 1,
      "price": 14.49
    }
  ],
  "total": 66.47,
  "customerDetails": {
    "_id": "CUST001",
    "name": "John Doe",
    "email": "johndoe@email.com",
    "address": {
      "street": "123 Maple Street",
      "city": "Springfield",
      "state": "IL",
      "postalCode": "62704",
      "country": "USA"
    }
  }
}
```

In the result we clearly see that `customerDetails` from `customers` collection is added to the result performed by the 
query. So `$lookup` can be defined as an aggregation stage used to **join data** from two collections similar to how
SQL performs JOIN.

```
$lookup: {
  from: "customers",            // the collection to join with
  localField: "customerId",     // field from the orders collection
  foreignField: "_id",          // field from the customers collection
  as: "customerDetails"         // name of the new field to store joined data
}
```

- This matches documents from the `orders` collection with documents in the `customers` collection where 
`orders.customerId == customers._id`.
- The matched customer(s) are stored in a new array field called `customerDetails`.
- Even if there's only one match, `$lookup` always outputs an array.
- A `$unwind` at the end of `$lookup` will make it easier to access the resulting documents.

#### Read also
- [Project Aggregation](project-aggregation.md)
- [Unwind Aggregation](unwind-aggregation.md)
## $unwind Stage in Aggregation

Consider the below order:

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

If we unwind this order based on items, using the following command

```shell
db.orders.aggregate([
  { $unwind: "$items" }
])
```

The output will be:

```json
[
  {
    "_id": "ORD001",
    "customerId": "CUST001",
    "orderDate": { "$date": "2025-01-05T09:30:00.000Z" },
    "status": "Delivered",
    "paymentMethod": "Credit Card",
    "items": {
      "productId": "PROD1001",
      "quantity": 2,
      "price": 25.99
    },
    "total": 66.47
  },
  {
    "_id": "ORD001",
    "customerId": "CUST001",
    "orderDate": { "$date": "2025-01-05T09:30:00.000Z" },
    "status": "Delivered",
    "paymentMethod": "Credit Card",
    "items": {
      "productId": "PROD1004",
      "quantity": 1,
      "price": 14.49
    },
    "total": 66.47
  }
]
```

In output, we have `items` as object instead of having it as an array. Therefore `unwind` is an aggregation stage used 
to **deconstruct an array field** in your document and **create a separate document for each element** in the array

#### Read also
- [Lookup Aggregation](lookup-aggregation.md)
- [Project Aggregation](project-aggregation.md)
## $project Stage in Aggregation

`$project` is an aggregation stage used to reshape documents by including, excluding, or transforming fields. It lets 
you control exactly what fields appear in the output and how they appear.

For Example:

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

If we project the json with the following command
```shell
db.customers.aggregate([
  {
    $project: {
      _id: 0,
      customerId: "$_id",
      name: "$name",
      city: "$address.city"
    }
  }
])
```

The output will be:

```json
{
  "customerId": "CUST001",
  "name": "John Doe",
  "city": "Springfield"
}
```

#### Read also
- [Lookup Aggregation](lookup-aggregation.md)
- [Unwind Aggregation](unwind-aggregation.md)

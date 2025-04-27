## 🗂️ Sample Dataset

This dataset is used as example in
- [Kafka Streams](README.md)
- [KSQL Streams](ksql-streams.md)

```json
{
  "orderId": "12345",
  "customer": {
    "customerId": "cust-1",
    "name": "John Doe",
    "email": "john@example.com"
  },
  "items": [
    {
      "productId": "prod-1",
      "productName": "Laptop",
      "quantity": 1,
      "price": 1200.0
    },
    {
      "productId": "prod-2",
      "productName": "Mouse",
      "quantity": 2,
      "price": 25.0
    }
  ],
  "orderDate": "2025-04-26T10:00:00Z",
  "status": "SHIPPED"
}
```
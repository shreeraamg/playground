## 🗂️ Sample Dataset

For the examples shown in [Aggregation Pipelines](aggragation-pipelines.md), I have used these two collections.

- `products`: list of all available products
- `orders`: customer orders that include one or more products

Here's the preview of the data structure

#### 📦 products (collection)

```json
{
  "_id": "PROD1001",
  "name": "Wireless Mouse",
  "category": "Electronics",
  "price": 25.99,
  "stock": 150,
  "tags": [ "computer", "accessory", "wireless" ]
}
```

#### 🧾 orders (collection)

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
# Row Level Security (RLS)

A database security management system that controls access to individual rows in a table, based on the user executing a
query.

Instead of granting or denying access to and entire table or view, RLS applies **filters or predicates at the row
level**, ensuring each uses sees only the subset of data they are authorized to view.

This mostly comes into picture where multi-tenant applications share the same database.

### Example

Consider you have the following user records:

| User Id | Name  | Tenant    |
|---------|-------|-----------|
| 1       | Alice | google    |
| 2       | Bob   | microsoft |
| 3       | Mike  | netflix   |
| 4       | John  | microsoft |
| 5       | David | netflix   |

With row-level security, you could enforce a policy such that

- Google users can only see the rows where `Tenant = 'google'`.
- Microsoft users can only see the rows where `Tenant = 'microsoft'`.
- Admin users can see all the rows.

So when Bob queries the `Users` table, he only gets 2 rows (his own department). He doesn't even know other rows exist.

### How it's implemented

- Policies or security predicates (`CREATE POLICY`)
- Views with filters (Manual workaround before built-in RLS existed)
- Application-level logic (app writes queries enforcing filters)

### SQL vs NoSQL

- **Relational Database** - RLS is most commonly discussed in SQL based systems, as relational databases store
  multi-tenant or role-based data where fine-grained filtering is important.

- **NoSQL Databases** - Some NoSQL databases also support row-level or document-level access control.
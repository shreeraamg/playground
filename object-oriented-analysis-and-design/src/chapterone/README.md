# Well Designed Apps Rock

### Three simple steps in designing an application.
1. Make sure your software does what the customer wants it to do.
2. Apply basic OO principles to add flexibility.
3. Strive for a maintainable, reusable design.

### Iterations in this application

**Iteration 1:** [🔗](https://github.com/shreeraamg/playground/commit/9d6b78ff84018b308e8e5809484702a64ad30ed2)
- Build an MVP of the application with customers requirement.
- When end consumers search for guitar return that or say not found.

**Iteration 2:** [🔗](https://github.com/shreeraamg/playground/commit/79aa0f815bdeecbeb9510be66a17f61492a9951b)
- Basic 00 Principles
- Implement type safety for the options that end consumers give.

**Iteration 3:** [🔗](https://github.com/shreeraamg/playground/commit/0d711159ec50f4d66ac3e9ef67076a8bf92b949a)
- New Feature Implementation
- Return multiple guitars when consumer search with certain input fields.

**Iteration 4:** [🔗](https://github.com/shreeraamg/playground/commit/0d711159ec50f4d66ac3e9ef67076a8bf92b949a)
- Implement Encapsulation (OO Principles)
- Encapsulate the fields with which consumers search in a subclass of Guitar
so that each time a new spec is the Guitar class doesn't need a change.

**Iteration 5:** [🔗](https://github.com/shreeraamg/playground/commit/f1cc427bc27567900ec4492f2560d7c35301f1ac)
- Feature Implementation + Design Patterns
- Add a new field `int numStrings` in GuitarSpec
- Now only GuitarSpec has changed along with Guitar's constructor and Inventory's 
search method.
- Delegate search functionality to equals object in GuitarSpec.
- Change Guitar's constructor and Inventory's search method to take object of 
GuitarSpec instead of specific fields.

After 5 iterations we have made our application such that even if new spec fields
come in we have to change only in one class.

Every Iteration has a commit in this repository. Click 🔗 to see commits



### Summary

- Encapsulation is about breaking the application into logical parts and not just 
hiding fields using getters and setters.
- Delegation is giving another object the responsibility of handling a particular task.
- Flexibility is about changes in the software doesn't need much rework and keep the
application robust instead of being fragile.
- Functionality is about the customer need, The application must do what it's supposed to.
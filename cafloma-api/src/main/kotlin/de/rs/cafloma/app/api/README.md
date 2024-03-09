# *CaFloMa* API

## Package Structure Explained

The package structure is designed as follows:

- `<context>` holds all classes to a specific context (e.g. `transaction`)
  - `int` holds classes which instances as a whole should never leave the application (e.g. database entities)
  - `sys` holds the business logic, building the middleware between both packages `int` and `ext`
  - `ext` holds classes which contents are request and response payload. Those classes are exposed outside the application


- `core` holds all classes that are used across context packages
  - `int` the same explanation as shown above
  - `sys` the same explanation as shown above
  - `ext` the same explanation as shown above
## PART A

Ghost code generation-

```java
public record UserDTO(long id, String email, String name) {
}
```
After opening `user.java` and retriggering
```java
public record UserDTO(long id, String email, String name) {
}
```

## PART B

- It doesn't compile the error it gives is 
```bash
UserDTO.java:9: error: cannot find symbol
        return new UserDTO(user.id(), user.email(), user.name());
                               ^
  symbol:   method id()
  location: variable user of type User
UserDTO.java:9: error: cannot find symbol
        return new UserDTO(user.id(), user.email(), user.name());
                                          ^
  symbol:   method email()
  location: variable user of type User
UserDTO.java:9: error: cannot find symbol
        return new UserDTO(user.id(), user.email(), user.name());
                                                        ^
  symbol:   method name()
  location: variable user of type User
3 errors
```

- I fixed it by hand by using getters and not directly private fields.

## PART C

AI Generated code which was correct similar to handwritten one.




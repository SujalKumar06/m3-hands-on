/**
 * Session M3 Part A / B: replace this empty record header with the
 * fields Copilot suggests once you re-trigger ghost text after
 * opening User.java in a second tab. Then add a static
 * {@code fromUser(User)} mapper as described in Part B.
 */
public record UserDTO(long id, String email, String name) {
    public static UserDTO fromUser(User user) {
        return new UserDTO(user.getId(), user.getEmail(), user.getName());
    }

    public static void main (String[] args) {
        User user = new User(1, "Sujal", "Sujal@email.com", true);
        UserDTO userDTO = UserDTO.fromUser(user);
        System.out.println(userDTO);
    }
}

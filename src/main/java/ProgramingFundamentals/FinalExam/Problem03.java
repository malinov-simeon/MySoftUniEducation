import java.util.*;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<User> records = new ArrayList<>();
        while (!input.equals("Log out")) {
            String command = input.split(": ")[0];
            String username = input.split(": ")[1];
            boolean registeredUser = containsUser(records, username);
            switch (command) {
                case "New follower":
                    if (!registeredUser) {
                        User user = new User(username, 0, 0);
                        records.add(user);
                    }
                    break;
                case "Like":
                    int count = Integer.parseInt(input.split(": ")[2]);
                    if (registeredUser) {
                        for (User record : records) {
                            if (record.getUsername().equals(username)) {
                                record.setLikes(record.getLikes() + count);
                            }
                        }
                    } else {
                        User user = new User(username, count, 0);
                        records.add(user);
                    }
                    break;
                case "Comment":
                    if (registeredUser) {
                        for (User record : records) {
                            if (record.getUsername().equals(username)) {
                                record.setComments(record.getComments() + 1);
                            }
                        }
                    } else {
                        User user = new User(username, 0, 1);
                        records.add(user);
                    }
                    break;
                case "Blocked":
                    if (registeredUser) {
                        records.removeIf(record -> record.getUsername().equals(username));
                    } else {
                        System.out.printf("%s doesn't exist.%n", username);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(records.size() + " followers");
        records.stream().sorted((u1, u2) -> Integer.compare(u2.sum(), u1.sum()))
                .forEach(user -> System.out.println(user.getUsername() + ": " + user.sum()));
    }

    static class User {
        String username;
        int likes;
        int comments;

        public User(String username, int likes, int comments) {
            this.username = username;
            this.likes = likes;
            this.comments = comments;
        }

        public String getUsername() {
            return username;
        }

        public int getLikes() {
            return likes;
        }

        public int getComments() {
            return comments;
        }

        public void setComments(int followers) {
            this.comments = followers;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        public int sum() {
            return this.likes + this.comments;
        }
    }

    public static boolean containsUser(List<User> records, String username) {
        boolean registeredUser = false;
        for (User record : records) {
            if (record.getUsername().equals(username)) {
                registeredUser = true;
            }
        }
        return registeredUser;
    }
}

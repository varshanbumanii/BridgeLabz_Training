package datastructures.linkedlist.singular;

import java.util.Scanner;

// -------- Friend Node --------
class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int id) {
        this.friendId = id;
        this.next = null;
    }
}

// -------- User Node --------
class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friends;     // Nested Linked List
    UserNode next;

    UserNode(int id, String name, int age) {
        this.userId = id;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }
}

// -------- User Linked List --------
class UserLinkedList {
    UserNode head = null;

    // Add new user
    void addUser(int id, String name, int age) {
        UserNode node = new UserNode(id, name, age);
        node.next = head;
        head = node;
        System.out.println("User added.");
    }

    // Find user by ID
    UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Find user by name
    UserNode findUserByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add friend connection (bi-directional)
    void addFriend(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found.");
            return;
        }

        addFriendNode(u1, id2);
        addFriendNode(u2, id1);

        System.out.println("Friend connection added.");
    }

    private void addFriendNode(UserNode user, int friendId) {
        FriendNode node = new FriendNode(friendId);
        node.next = user.friends;
        user.friends = node;
    }

    // Remove friend connection
    void removeFriend(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found.");
            return;
        }

        removeFriendNode(u1, id2);
        removeFriendNode(u2, id1);

        System.out.println("Friend connection removed.");
    }

    private void removeFriendNode(UserNode user, int friendId) {
        FriendNode temp = user.friends;
        FriendNode prev = null;

        while (temp != null) {
            if (temp.friendId == friendId) {
                if (prev == null)
                    user.friends = temp.next;
                else
                    prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    // Display friends of user
    void displayFriends(int id) {
        UserNode user = findUserById(id);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        FriendNode temp = user.friends;
        if (temp == null) {
            System.out.println("No friends.");
            return;
        }

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Mutual friends
    void mutualFriends(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Mutual Friends:");
        FriendNode f1 = u1.friends;
        boolean found = false;

        while (f1 != null) {
            FriendNode f2 = u2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }

        if (!found)
            System.out.println("None");
        else
            System.out.println();
    }

    // Count friends
    void countFriends() {
        UserNode temp = head;

        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends.");
            temp = temp.next;
        }
    }

    // Search user
    void searchUser(String key) {
        UserNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (String.valueOf(temp.userId).equals(key) ||
                    temp.name.equalsIgnoreCase(key)) {
                displayUser(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("User not found.");
    }

    void displayUser(UserNode user) {
        System.out.println("---------------------");
        System.out.println("ID   : " + user.userId);
        System.out.println("Name : " + user.name);
        System.out.println("Age  : " + user.age);
    }
}

// -------- MAIN --------
public class SocialMediaLinkedListDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserLinkedList users = new UserLinkedList();

        while (true) {
            System.out.println("\n1.Add User\n2.Add Friend\n3.Remove Friend\n4.Display Friends\n5.Mutual Friends\n6.Search User\n7.Count Friends\n8.Exit");
            int choice = sc.nextInt();

            int id, id2, age;
            String name, key;

            switch (choice) {

                case 1:
                    sc.nextLine();
                    System.out.print("User ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    System.out.print("Age: ");
                    age = sc.nextInt();
                    users.addUser(id, name, age);
                    break;

                case 2:
                    System.out.print("User1 ID: ");
                    id = sc.nextInt();
                    System.out.print("User2 ID: ");
                    id2 = sc.nextInt();
                    users.addFriend(id, id2);
                    break;

                case 3:
                    System.out.print("User1 ID: ");
                    id = sc.nextInt();
                    System.out.print("User2 ID: ");
                    id2 = sc.nextInt();
                    users.removeFriend(id, id2);
                    break;

                case 4:
                    System.out.print("Enter User ID: ");
                    id = sc.nextInt();
                    users.displayFriends(id);
                    break;

                case 5:
                    System.out.print("User1 ID: ");
                    id = sc.nextInt();
                    System.out.print("User2 ID: ");
                    id2 = sc.nextInt();
                    users.mutualFriends(id, id2);
                    break;

                case 6:
                    sc.nextLine();
                    System.out.print("Search by Name or ID: ");
                    key = sc.nextLine();
                    users.searchUser(key);
                    break;

                case 7:
                    users.countFriends();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}


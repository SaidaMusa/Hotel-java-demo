import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       RoomManagement roomManagement = new RoomManagement();
       HotelManagement hotelManagement = new HotelManagement();
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;
        boolean exit = false;
        int choice;
        while (!loggedIn) {
            System.out.println("1 - Register\n2 - Login\n3 - Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String regUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String regPassword = scanner.nextLine();
                    hotelManagement.register(regUsername, regPassword);
                    while (!exit){
                        System.out.println();
                        System.out.println("1 - Add food");
                        System.out.println("2 - ShowAllFood");
                        System.out.println("3 - RemoveFoodById");
                        System.out.println("4 - Exit");
                        System.out.println("Enter command: ");
                        choice = scanner.nextInt();
                        scanner.nextLine();
                        switch (choice){
                            case 1:
                                System.out.println("Enter id: ");
                                int id = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Enter name: ");
                                int price = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Enter type: ");
                                String type = scanner.nextLine();
                                System.out.println("Enter type: ");
                                String status = scanner.nextLine();
                                Room room = new Room(id,type,price,status);
                                roomManagement.addRoom(room);
                                System.out.println("Added successfully!");
                                break;
                            case 2:
                                roomManagement.showAllRooms();
                                break;
                            case 3:
                                System.out.println("Enter ID: ");
                                int removeId = scanner.nextInt();
                                roomManagement.removeRoomById(removeId);
                                break;
                            case 4:
                                exit = true;
                                System.out.println("Exited program!");
                                break;
                        }
                        break;
                    }
                    break;


                case 2:
                    System.out.print("Enter username: ");
                    String logUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String logPassword = scanner.nextLine();
                    loggedIn = hotelManagement.login(logUsername,logPassword);
                    while (!exit){
                        System.out.println();
                        System.out.println("1 - Add food");
                        System.out.println("2 - ShowAllFood");
                        System.out.println("3 - RemoveFoodById");
                        System.out.println("4 - Exit");
                        System.out.println("Enter command: ");
                        choice = scanner.nextInt();
                        scanner.nextLine();
                        switch (choice){
                            case 1:
                                System.out.println("Enter id: ");
                                int id = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Enter price: ");
                                int price = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Enter type: ");
                                String type = scanner.nextLine();
                                System.out.println("Enter status: ");
                                String status = scanner.nextLine();
                                Room room = new Room(id,type, price,status);
                                roomManagement.addRoom(room);
                                System.out.println("Added successfully!");
                                break;
                            case 2:
                                roomManagement.showAllRooms();
                                break;
                            case 3:
                                System.out.println("Enter ID: ");
                                int removeId = scanner.nextInt();
                                roomManagement.removeRoomById(removeId);
                                break;
                            case 4:
                                exit = true;
                                System.out.println("Exited program!");
                                break;
                        }
                        break;
                    }

                    break;
                case 3:
                    System.out.println("Exited program!");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }


    }

    }

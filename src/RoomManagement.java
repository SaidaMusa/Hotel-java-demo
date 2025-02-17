import java.util.ArrayList;

public class RoomManagement {
    ArrayList<Room> rooms = new ArrayList<>();
    public void addRoom(Room room){
        rooms.add(room);
    }

    public void showAllRooms(){
      if (rooms.isEmpty()){
          System.out.println("The room is not exist now!");
      }else {
          System.out.println("Room list: ");
          for(Room room: rooms){
             room.showRoomInfo();
              System.out.println("\n*****************");
          }
      }
    }

    public void removeRoomById(int id){
        boolean found = false;
        for (Room room : rooms){
          if(room.getId() == id){
            rooms.remove(room);
              System.out.println("Room with this id: "+id+"");
          }
        }

        if (!found){
            System.out.println("Room with this id: "+id+" was not found!");
        }
    }
}

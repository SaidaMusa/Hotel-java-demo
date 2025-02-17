public class Room {
   private int id;
   private String type;
   private int  price;
   private String status;

    public Room(int id, String type, int price, String status) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void showRoomInfo(){
        System.out.printf("ID: %s\nType: %s\nPrice: %s\nStatus: %s yulduzli",id, type, price,status);
    }
}

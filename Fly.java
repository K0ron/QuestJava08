public interface Fly {

    void takeOff();

    int ascend(int meters);

    int descend(int meters);

    default void glide() {
        System.out.println("Glides into the air");
    };

    void land();


}

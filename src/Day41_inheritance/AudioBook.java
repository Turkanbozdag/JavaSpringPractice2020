package Day41_inheritance;

public class AudioBook extends Book {
    /*
    title(inherited)
    author(inherited)
    price(inherited)


    length(declared)
    listen(declared)

    narrotor
    listen()
    toString()(inherited)
     */
    public String length;

    public void Listen(){
        System.out.println("listening to "+title);
    }






}

package officeHours.jun10;
/*Social Media

(*) Create an abstract class for Social Media that has the following features:

    - Direct messaging(String username, String message)

    - Post(String body)

    - Notifications(int time)

 */
public abstract class SocialMedia {
    String personalUrl;
    int accountLength;
    static String platform;
    public abstract boolean directMessage(String username,String message);
    public abstract boolean createPost(String body);
    public abstract void notification(int time);














}

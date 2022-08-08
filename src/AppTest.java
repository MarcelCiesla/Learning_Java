public class AppTest {

    public static void main(String[] args) {
        AndroidApp android = new AndroidApp("calculator");
        android.appinfo();
        android.runAndroidApp();


        IphoneApp iphoneApp = new IphoneApp("calculator");
        iphoneApp.appinfo();
        iphoneApp.runIphoneApp();

    }
}

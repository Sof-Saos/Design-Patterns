import com.example.util;
public class Main {

    public static void main(String[] args) {
        LicenseManager licenseManager = LicenseManager.getInstance();
        licenseManager.setLicenseKey("2235-DFFSS");

        licenseManager.validateLicense();

        if (licenseManager.isLicence()) {
            System.out.println(green + "Licencia valida, operaciones permitidas");
        } else {
            System.out.println(red + "Licencia invalida, no se puede continuar");
        }


    }
}

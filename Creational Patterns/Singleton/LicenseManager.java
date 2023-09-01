public class LicenseManager {
    private static LicenseManager instance;
    private boolean isLicense;
    private String licenseKey;

    private LicenseManager(){ //constructor privado
        isLicense = false;
        licenseKey = null;
    }

    public static LicenseManager getInstance(){
        if (instance == null){
            instance = new LicenseManager();
        }
        return instance;
    }

    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    public boolean isLicence() {
        return isLicense;
    }

    public boolean validateLicense(){
       if (licenseKey != null && !licenseKey.isEmpty() ) {
           return isLicense = true;
       } else {
           return isLicense = false;
       }
    }


}

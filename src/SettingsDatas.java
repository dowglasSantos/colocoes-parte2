import java.util.UUID;

public class SettingsDatas {
    private String idUser;
    private String nameUser;
    private String sexUser;

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser() {
        this.idUser = UUID.randomUUID().toString();
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getSexUser() {
        return sexUser;
    }

    public void setSexUser(String sexUser) {
        this.sexUser = sexUser;
    }

    public SettingsDatas() {
        this.idUser = "";
        this.nameUser = "";
        this.sexUser = "";
    }

    public SettingsDatas(String idUser, String nameUser, String sexUser) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.sexUser = sexUser;
    }

    @Override
    public String toString() {
        return "ID='" + idUser + '\'' +
                ", nome='" + nameUser + '\'' +
                ", sexo='" + sexUser + '\'' +
                '}';
    }
}

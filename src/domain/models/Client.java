package domain.models;

import domain.enums.ClientType;

public class Client {
    private String identifeir;
    private String fullName;
    private String email;
    private ClientType type;
    private String contact;

    public Client(String identifeir, String fullName, String email, ClientType type, String contact) {
        this.identifeir = identifeir;
        this.fullName = fullName;
        this.email = email;
        this.type = type;
        this.contact = contact;
    }
    public Client(){}

    public String getIdentifeir() {
        return identifeir;
    }

    public void setIdentifeir(String identifeir) {
        this.identifeir = identifeir;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ClientType getType() {
        return type;
    }

    public void setType(ClientType type) {
        this.type = type;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}



package ac.i.geekgardenapp.Model;

public class data_customer {

private String nama;
private String email;
private String password;
private String notlp;
private String key;

public data_customer() {
        }

public data_customer(String nama, String email, String password, String notlp) {
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.notlp = notlp;
        }

public String getNama() {
        return nama;
        }

public void setNama(String nama) {
        this.nama = nama;
        }

public String getEmail() {
        return email;
        }

public void setEmail(String email) {
        this.email = email;
        }

public String getPassword() {
        return password;
        }

public void setPassword(String password) {
        this.password = password;
        }

public String getNotlp() {
        return notlp;
        }

public void setNotlp(String notlp) {
        this.notlp = notlp;
        }

public String getKey() {
        return key;
        }

public void setKey(String key) {
        this.key = key;
        }

        }

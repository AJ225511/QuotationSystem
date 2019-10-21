package wiese.domain.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
public class Client {

    @Id
    private String fname;
    private String lname;
    private String address;
    private String clientId;

    public Client(){}

    private Client(Builder builder){
        this.address = builder.address;
        this.fname = builder.fname;
        this.lname = builder.lname;
        this.clientId = builder.clientId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getAddress() {
        return address;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public static class Builder{
        private String fname;
        private String lname;
        private String address;
        private String clientId;

        public Builder(){}

        public Builder fname(String fname){
            this.fname = fname;
            return this;
        }

        public Builder lname(String lname){
            this.lname = lname;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder clientId(String clientId){
            this.clientId = clientId;
            return this;
        }

        public Builder copy(Client client){
            this.clientId(client.getClientId());
            this.address(client.getAddress());
            this.fname(client.getFname());
            this.lname(client.getLname());
            return this;
        }

        @Override
        public String toString(){
            return "Builder{" +
                    "clientId=" +clientId+
                    ", address='" + address + '\'' +
                    ", fname='" + fname + '\'' +
                    ", lname='" + lname + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o){
            if(this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder that = (Builder) o;
            return Objects.equals(clientId, that.clientId) &&
                    Objects.equals(address, that.address)&&
                    Objects.equals(fname, that.fname)&&
                    Objects.equals(lname, that.lname);
        }

        @Override
        public int hashCode(){
            return Objects.hash(clientId, address, fname, lname);
        }

        public Client build() {
            return new Client(this);
        }
    }
}

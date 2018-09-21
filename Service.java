package book;

import java.util.Objects;

public class Service {


    private int mileage;
    private Date date;


    public Service (int mileage, Date date){

        this.mileage = mileage;
        this.date = date;

    }

    public int getMileage() {
        return mileage;
    }

    public Date getDate() {
        return date.copy();
    }

    public boolean isOlder(Service service){

        if (date.getYear()<service.getDate().getYear()){return true;}
        if (date.getMonth()<service.getDate().getMonth()){return true;}
        if (date.getDay()<service.getDate().getDay()){return true;}

        return false;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return mileage == service.mileage &&
                Objects.equals(date, service.date);
    }


    public int hashCode() {
        return Objects.hash(mileage, date);
    }


    public String toString() {
        return "Service: (" + "Mileage: " + mileage +"h" + ", Date: " + date + ")";
    }
}

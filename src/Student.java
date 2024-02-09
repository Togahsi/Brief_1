public class Student {

        private String First_Name;
        private String Last_Name;
        private String Date_Of_Birth;
        private String Address;
        private double Tele_Number;
        private int Class_Number;
        private  int Id_Number;


    public  Student()
    {

    }
        public  Student(String first_name,String last_name,String date_of_birth,String address,double tele_number,int class_number,int id_number)
        {
            First_Name = first_name;
            Last_Name = last_name;
            Date_Of_Birth = date_of_birth;
            Address = address;
            Tele_Number = tele_number;
            Class_Number = class_number;
            Id_Number = id_number;
        }

        public String getFirst_Name() {
            return First_Name;
        }

        public void setFirst_Name(String first_Name) {
            First_Name = first_Name;
        }

        public String getLast_Name() {
            return Last_Name;
        }

        public void setLast_Name(String last_Name) {
            Last_Name = last_Name;
        }

        public String getDate_of_birth() {
            return Date_Of_Birth;
        }

        public void setDate_of_birth(String date_of_birth) {
            Date_Of_Birth = date_of_birth;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public double getTele_Number() {
            return Tele_Number;
        }

        public void setTele_Number(double tele_Number) {
            Tele_Number = tele_Number;
        }

        public int getClass_Number() {
            return Class_Number;
        }

        public void setClass_Number(int class_Number) {
            Class_Number = class_Number;
        }

        public int getId_Number() {
            return Id_Number;
        }

        public void setId_Number(int id_Number) {
            Id_Number = id_Number;
        }
    }



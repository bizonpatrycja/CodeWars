public class Car {
    public Body body;
    public Chassis chassis;
    private int lentgh;
    private int axles;
    private int doors;

    public Car(int length, int doors) {
        if(length < 7){
            throw new IllegalArgumentException("Parameter 'length' is too small");
        }
        if(doors < 1 || doors > (length - 3)/2){
            throw new IllegalArgumentException("Parameter 'door' is either less than 1 or too big");
        }

        this.lentgh = length;
        this.doors = doors;
        this.axles = countAxles();

        this.body = new Body(this.lentgh, this.doors); //at this point two first layers are drawn
        this.chassis = new Chassis(this.lentgh, this.axles); //third layer is drawn
    }

    private int countAxles(){
        if(this.lentgh < 12){
            return 2;
        }
        else return (2 + (this.lentgh - 11 + 1)/2);
    }

    public String toString(){
        return this.body.component + this.chassis.component;
    }

    // definition of other classes
    public class Body{
        private String firstLayer; //length - 2
        private String secondLayer; //length - 1
        public String component;
        private int length;
        private int doors;

        public Body(int length, int doors){
            this.firstLayer = "";
            this.secondLayer = "";
            this.length = length;
            this.doors = doors;

            drawFirstLayer();
            drawSecondLayer();

            this.component = firstLayer + secondLayer;
        }

        private void drawFirstLayer(){
            this.firstLayer += " ";
            for(int i = 1; i <= (this.length - 2 - 1); i++){
                this.firstLayer += "_";
            }
            this.firstLayer += "\n";
        }

        private void drawSecondLayer(){
            this.secondLayer += "|";

            int howManySpaces = this.length - 3 - this.doors*2;
            int frontDoors = (this.doors + 1)/2;
            int rearDoors = this.doors/2;

            for(int i = 1; i <= rearDoors; i++){
                this.secondLayer += "[]";
            }
            for(int i = 1; i <= howManySpaces; i++){
                this.secondLayer += " ";
            }
            for(int i = 1; i <= frontDoors; i++){
                this.secondLayer += "[]";
            }
            this.secondLayer += "\\";
            this.secondLayer += "\n";
        }

        public String toString(){
            return this.component;
        }

    }

    public class Chassis{
        public String component; //length
        private int length;
        private int axels;

        public Chassis(int length, int axels){
            this.component = "";
            this.length = length;
            this.axels = axels;

            drawThirdLayer();
        }

        public void drawThirdLayer(){
            this.component += "-";

            int howManySpaces = this.length - 2 - this.axels*2;
            int frontAxels = this.axels/2;
            int rearAxels = this.axels/2;

            if(this.axels == 2){
                rearAxels = 1;
            }
            else if(this.axels%2 == 1){
                rearAxels++;
            }

            for(int i = 1; i <= rearAxels; i++){
                this.component += "o-";
            }
            for(int i = 1; i <= howManySpaces; i++){
                this.component += "-";
            }
            for(int i = 1; i <= frontAxels; i++){
                this.component += "o-";
            }
            this.component += "'";
        }

        public String toString(){
            return this.component;
        }
    }
}

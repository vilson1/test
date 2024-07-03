package interfase.carTask;

    public abstract class Car {

        private final String make;
        private String color;
        private final String model;
        private final int year;
        private double price;
        public Car(String make, String color, String model, int year, double price) {
            if (make != null && !make.isEmpty()) {
                this.make = make;
            } else {
                throw new IllegalArgumentException("make can not be empty, blank or null");
            }
            setColor(color);
            if (model != null && !model.isEmpty()) {
                this.model = model;
            } else {
                throw new IllegalArgumentException("Model can not be empty, blank or null");
            }
            if (year > 1886) {
                this.year = year;
            } else {
                throw new IllegalArgumentException(" Year can not less than 1886");
            }
            this.price = price;
        }
        public abstract void start();
        public abstract void drive();
        public void stop() {
            System.out.println(model + "stops at..");
        }
        public String getMake() {
            return make;
        }

        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            if (color != null && !color.isEmpty()) {
                this.color = color;
            } else {
                throw new IllegalArgumentException("color can not be empty, blank or null");
            }
        }
        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            if (price > 0) {
                this.price = price;
            } else {
                throw new IllegalArgumentException("Price can not be negative");
            }
        }
        @Override
        public String toString() {
            return "CarTask{" +
                    "make='" + make + '\'' +
                    ", color='" + color + '\'' +
                    ", model='" + model + '\'' +
                    ", year=" + year +
                    ", price=" + price +
                    '}';
        }
    }



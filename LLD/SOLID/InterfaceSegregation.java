public class InterfaceSegregation {
    public static void main(String[] args) {
        public class Animal{
            public void feed();
            public void groom();
        }
        public class Tiger extends Animal{
            public void feed();
            public void groom();
        }
        public class Dog extends Animal{
            public void feed();
            public void groom();
        }
        /*
         * Proper Form
         */
        public class Animal{
            public void feed();
        }
        public class Pet extends Animal{
            public void groom();
        }
        public class Tiger extends Animal{
            public void feed();
        }
        public class Dog extends Pet{
            public void feed();
            public void groom();
        }
    }
}
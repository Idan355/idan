public class Ex1Original {


        class Item {
            int id;
            String name;
        }
        public class Items{
            static final int maxinput =10;
            private int lastchange;
            private Items[]Items;
            public Items(){
                this.Items=new Items[maxinput];
            }
        }
        public void findItem(int id,int index,int Items[]){
            if(id==Items[index]){
                System.out.print(index);
            }
        }


        public void delete(int index,int Items[]){
            if (index<10) {
                Items[index]= 0;
            }
        }

}

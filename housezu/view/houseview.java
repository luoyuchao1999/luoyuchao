package housezu.view;

import housezu.House.House;
import housezu.Server.houseserver;
import housezu.utils.Utility;

public class houseview {
    private boolean loop=true;
    private char key=' ';
    private houseserver server=new houseserver(2);
    public void mainView(){
        do{
            System.out.println("=================房屋出租系统===================");
            System.out.println("\t\t\t1.新增房源");
            System.out.println("\t\t\t2.查找房屋");
            System.out.println("\t\t\t3.删除");
            System.out.println("\t\t\t4.修改");
            System.out.println("\t\t\t5.房屋列表");
            System.out.println("\t\t\t6.退出");
            System.out.println("请输入你得选择（1-6）");
            key= Utility.readChar();
            switch (key){
                case '1':
                    addhouse();
                    break;
                case '2':
                    findhouse();
                    break;
                case '3':
                    delhouse();
                    break;
                case '4':
                    uphouse();
                    break;
                case '5':
                    showhouse();
                    break;
                case '6':
                    exit();
                    break;
                default:
                    System.out.println("输入有误");
            }
        }while (loop);
    }

    private void addhouse() {
        System.out.println("===================== 增加房屋==================");
        System.out.println("姓名");
        String name= Utility.readString(4);
        System.out.println("电话");
        String phone= Utility.readString(11);
        System.out.println("地址");
        String adress= Utility.readString(20);
        System.out.println("租金");
        int rent=Utility.readInt();
        System.out.println("状态");
        String state= Utility.readString(3);
        House house=new House(0,name,phone,adress,rent,state);
        if(server.add(house)){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }

    private void findhouse() {
        System.out.println("==================查找除房屋====================");
        System.out.println("输入要查找的编号（-1代表放弃）");
        int findid=Utility.readInt(-1);
        if(findid==-1){
            System.out.println("放弃");
        }
        System.out.println(server.find(findid));
    }

    private void delhouse() {
        System.out.println("==================删除房屋====================");
        System.out.println("输入要删除的编号（-1代表放弃删除）");
        int delid=Utility.readInt();
        if(delid==-1){
            System.out.println("放弃删除");
            return;
        }
        char ch=Utility.readConfirmSelection();
        if(ch=='Y') {
            if (server.del(delid)) {
                System.out.println("删除成功");
            }
        }
        else{
            System.out.println("放弃");
        }
    }

    private void uphouse() {
        System.out.println("===============修改房屋======================");
        System.out.println("输入要修改的房屋编号（-1代表放弃）");
        int upid=Utility.readInt(-1);
        if(upid==-1){
            System.out.println("放弃修改");
            return;
        }
        House house=server.find(upid);
        System.out.println(house);
        System.out.print("姓名：");
        String name=Utility.readString(4,"");
        if(!name.equals("")){
            house.setName(name);
        }
        System.out.print("电话：");
        String phone=Utility.readString(11,"");
        if(!phone.equals("")){
            house.setPhone(phone);
        }
        System.out.print("地址：");
        String adress=Utility.readString(20,"");
        if(!adress.equals("")){
            house.setAdress(adress);
        }
        System.out.print("租金：");
        int rent=Utility.readInt(-1);
        if(rent!=-1){
            house.setRent(rent);
        }
        System.out.print("状态：");
        String state=Utility.readString(3,"");
        if(!state.equals("")){
            house.setState(state);
        }
        System.out.println("修改成功");
    }

    private void showhouse() {
        System.out.println("===============房屋列表======================");
        System.out.println("编号\t\t姓名\t\t电话\t\t地址\t\t租金\t\t状态");
        House[] houses=server.list();
        for(int i=0;i<houses.length;i++){
            if(houses[i]!=null)
            {System.out.println(houses[i]);}
        }
        System.out.println("===================显示完毕===================");
    }

    private void exit() {
        char c=Utility.readConfirmSelection();
        if(c=='Y'){
            loop=false;
        }
    }

}

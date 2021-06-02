package housezu.Server;

import housezu.House.House;
import housezu.utils.Utility;

public class houseserver {
    private House[] houses;
    private int housenum=1;
    private int idnum=1;
    public houseserver(int size){
        houses=new House[size];
        houses[0]=new House(1,"张三","1111111","大理寺",1000,"未出租");
    }
    public House[] list(){
        return houses;
    }
    public boolean add(House house){
        if(housenum==houses.length){
            System.out.println("房屋列表已满");
            return false;
        }else{
            house.setId(++idnum);
            houses[housenum]=house;
            return true;
        }
    }
    public boolean del(int delid){
        int index=-1;
        for(int i=0;i<housenum;i++){
            if(delid==houses[i].getId()){
                index=i;
            }
        }
        if(index==-1){
            System.out.println("编号不存在");
            return false;
        }
        for(int i=index;i<housenum-1;i++){
            houses[i]=houses[i+1];
        }
        houses[--housenum]=null;
        return true;
    }
    public House find(int findid){
        for(int i=0;i<housenum;i++){
            if(findid==houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
}

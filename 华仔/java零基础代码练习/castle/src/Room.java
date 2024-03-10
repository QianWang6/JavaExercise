import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author Qian Wang
 * @version 1.0
 */

public class Room {
        private String description;
        private HashMap<String,Room> exits = new HashMap<String,Room>();
//        private Room northExit;
//        private Room southExit;
//        private Room eastExit;
//        private Room westExit;


        public Room(String description) {
            this.description = description;
        }

        public void setExist(String direction, Room room){
            exits.put(direction,room);
        }
//        public void setExits(Room north, Room east, Room south, Room west)
//        {
//            if(north != null)
//                northExit = north;
//            if(east != null)
//                eastExit = east;
//            if(south != null)
//                southExit = south;
//            if(west != null)
//                westExit = west;
//        }

        @Override
        public String toString()
        {
            return description;
        }

        public String getExitDesc(){
            //stringbuffer可以不断修改字符串，而ret+的模式只能不断new新的字符串，系统开销很大
            StringBuffer stringBuffer = new StringBuffer();
            for (String dir :exits.keySet()){
                stringBuffer.append(dir);
                stringBuffer.append(" ");
            }
//            if (northExit!= null){
//                stringBuffer.append("north");
//            }
//            if (southExit!= null){
//                stringBuffer.append("south");;
//            }
//            if (westExit!= null){
//                stringBuffer.append("west");;
//            }
//            if (eastExit!= null){
//                stringBuffer.append("east");;
//            }
//            String ret = "";
//            if (northExit!= null){
//                ret+="north";
//            }
//            if (southExit!= null){
//                ret+="south";
//            }
//            if (westExit!= null){
//                ret+="west";
//            }
//            if (eastExit!= null){
//                ret+="east";
//            }
            return stringBuffer.toString();
        }

        public Room getExit(String direction){

//            if(direction.equals("north")) {
//                ret = northExit;
//            }
//            if(direction.equals("east")) {
//                ret = eastExit;
//            }
//            if(direction.equals("south")) {
//                ret = southExit;
//            }
//            if(direction.equals("west")) {
//                ret = westExit;
//            }
           return exits.get(direction);
        }
}


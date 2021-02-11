package nea.autopilot.system;

public class AutopilotVariables {
        boolean AutopilotMaster = false;
    
        boolean holdCurrentAltitude = false;
        boolean holdCurrentHeading = false;
        boolean holdCurrentSpeed = false;
        
        String directWaypointName = "";
        boolean directToWaypoint = false;
        int headingToWaypoint = 360;
        
        String routeName;
        boolean executeRoute = false;
        
        int altitudeSet = 0;
        int headingSet = 0;
        int speedSet = 0;
        
        boolean serialConnected = false;
        boolean radioConnected = false;
        
        double QNHset = 1013.25;
        char QNHtype = 'P'; // P for Pascal, I for Inches of Hg
}

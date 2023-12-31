package employeewage;

public class Empwage {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS =20;
    public static final int MAX_HRS_IN_MONTH = 100;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");


        int empHrs = 0;
        int empWage = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        for (;totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays <= NUM_OF_WORKING_DAYS;totalWorkingDays++){

            int empCheck = (int)Math.floor(Math.random()*10)%3;
            switch ( empCheck) {
                case IS_PART_TIME :
                    empHrs = 4;
                    break ;
                case IS_FULL_TIME :
                    empHrs = 8;
                default :
                    empHrs = 0;
            }

            empWage = empHrs*EMP_RATE_PER_HOUR;
            totalEmpHrs+=empHrs;
            System.out.println("Days : "+totalWorkingDays+" Employee hrs : "+empHrs);
        }
        int totalEmpwage = totalEmpHrs* EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage : "+totalEmpwage);
    }
}

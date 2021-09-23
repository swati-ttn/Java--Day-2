package day2;

public class UseException {
    public static void main(String[] args) throws CustomException {
        UseException uExp = null;

        try {
            uExp.getTitle();
        } catch (NullPointerException npe) {
            throw new CustomException("CustomException invoked on NPE");
        }
    }

    String getTitle() {
        return "blank title";
    }
}

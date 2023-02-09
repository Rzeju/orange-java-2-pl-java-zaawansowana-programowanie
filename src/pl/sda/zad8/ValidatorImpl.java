package pl.sda.zad8;

public class ValidatorImpl implements Validator {

    @Override
    public boolean validate(Parcel input) {
        if (input.getxLength() < 30 || input.getyLength() < 30
                || input.getzLength() < 30) {
            return false;
        }

        int sum = input.getxLength() + input.getyLength() + input.getzLength();
        if (sum > 300) {

            return false;
        }

        if (input.isExpress()) {
            if (input.getWeight() > 15.0f) {
                return false;
            }
        }

        if (!input.isExpress()) {
            if (input.getWeight() > 30.0f) {
                return false;
            }
        }

        return true;
    }
}

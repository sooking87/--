package Week6;

import java.awt.*;

public class CheckGroup {
    Checkbox check1, check2, check3;
    Checkbox freshman, sophomore, junior, senior;
    CheckboxGroup cbg;

    public CheckGroup() {
        Frame f = new Frame("Check Group Demo");
        f.setLayout(new FlowLayout());

        check1 = new Checkbox("One");
        check2 = new Checkbox("Two");
        check3 = new Checkbox("Three");

        cbg = new CheckboxGroup();
        freshman = new Checkbox("1학년", cbg, true);
        sophomore = new Checkbox("2학년", cbg, false);
        junior = new Checkbox("3학년", cbg, false);
        senior = new Checkbox("4학년", cbg, false);

        f.add(check1);
        f.add(check2);
        f.add(check3);

        f.add(freshman);
        f.add(sophomore);
        f.add(junior);
        f.add(senior);

        f.setSize(400, 400);
        f.setVisible(true);
    }
}

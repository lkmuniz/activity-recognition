package br.com.muniz.activityrecognition.data;

public class WekaDataActivity {

    public static double classify(Object[] i)
            throws Exception {

        double p = Double.NaN;
        p = N4d18ab6c80(i);
        return p;
    }

    static double N4d18ab6c80(Object[] i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 4;
        } else if (((Double) i[3]).doubleValue() <= -7.44524) {
            p = N233a10d181(i);
        } else if (((Double) i[3]).doubleValue() > -7.44524) {
            p = N49c8eef0110(i);
        }
        return p;
    }

    static double N233a10d181(Object[] i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 4;
        } else if (((Double) i[2]).doubleValue() <= 0.638822) {
            p = N193825882(i);
        } else if (((Double) i[2]).doubleValue() > 0.638822) {
            p = N504e4ea187(i);
        }
        return p;
    }

    static double N193825882(Object[] i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 3;
        } else if (((Double) i[2]).doubleValue() <= 0.012488) {
            p = N5da6d7a783(i);
        } else if (((Double) i[2]).doubleValue() > 0.012488) {
            p = N26a26a5085(i);
        }
        return p;
    }

    static double N5da6d7a783(Object[] i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 3;
        } else if (((Double) i[0]).doubleValue() <= 0.182569) {
            p = N556d44b484(i);
        } else if (((Double) i[0]).doubleValue() > 0.182569) {
            p = 4;
        }
        return p;
    }

    static double N556d44b484(Object[] i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 4;
        } else if (((Double) i[3]).doubleValue() <= -9.617532) {
            p = 4;
        } else if (((Double) i[3]).doubleValue() > -9.617532) {
            p = 3;
        }
        return p;
    }

    static double N26a26a5085(Object[] i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 4;
        } else if (((Double) i[2]).doubleValue() <= 0.097223) {
            p = N3bbead9e86(i);
        } else if (((Double) i[2]).doubleValue() > 0.097223) {
            p = 5;
        }
        return p;
    }

    static double N3bbead9e86(Object[] i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 4;
        } else if (((Double) i[0]).doubleValue() <= 0.883931) {
            p = 4;
        } else if (((Double) i[0]).doubleValue() > 0.883931) {
            p = 5;
        }
        return p;
    }

    static double N504e4ea187(Object[] i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 6.904059) {
            p = N6f39e8f888(i);
        } else if (((Double) i[0]).doubleValue() > 6.904059) {
            p = N4cfcf89b104(i);
        }
        return p;
    }

    static double N6f39e8f888(Object[] i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 3.436413) {
            p = N5afcffa589(i);
        } else if (((Double) i[2]).doubleValue() > 3.436413) {
            p = N6c4aefb5100(i);
        }
        return p;
    }

    static double N5afcffa589(Object[] i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -0.689272) {
            p = N14607b3990(i);
        } else if (((Double) i[1]).doubleValue() > -0.689272) {
            p = N4210575295(i);
        }
        return p;
    }

    static double N14607b3990(Object[] i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 1.967939) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 1.967939) {
            p = N3679045291(i);
        }
        return p;
    }

    static double N3679045291(Object[] i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -1.923319) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -1.923319) {
            p = N16a7544d92(i);
        }
        return p;
    }

    static double N16a7544d92(Object[] i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 1.544581) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 1.544581) {
            p = N2b1b90eb93(i);
        }
        return p;
    }

    static double N2b1b90eb93(Object[] i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 3.1772) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 3.1772) {
            p = N3cb59f0294(i);
        }
        return p;
    }

    static double N3cb59f0294(Object[] i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 3.305) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 3.305) {
            p = 0;
        }
        return p;
    }

    static double N4210575295(Object[] i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 2.847387) {
            p = N6eb9766196(i);
        } else if (((Double) i[5]).doubleValue() > 2.847387) {
            p = 2;
        }
        return p;
    }

    static double N6eb9766196(Object[] i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 2.626981) {
            p = N19d22f9597(i);
        } else if (((Double) i[0]).doubleValue() > 2.626981) {
            p = 5;
        }
        return p;
    }

    static double N19d22f9597(Object[] i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 5;
        } else if (((Double) i[0]).doubleValue() <= 0.90812) {
            p = 5;
        } else if (((Double) i[0]).doubleValue() > 0.90812) {
            p = N90ffe2298(i);
        }
        return p;
    }

    static double N90ffe2298(Object[] i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 1.275139) {
            p = N49e5929699(i);
        } else if (((Double) i[2]).doubleValue() > 1.275139) {
            p = 0;
        }
        return p;
    }

    static double N49e5929699(Object[] i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 5;
        } else if (((Double) i[1]).doubleValue() <= -0.260897) {
            p = 5;
        } else if (((Double) i[1]).doubleValue() > -0.260897) {
            p = 0;
        }
        return p;
    }

    static double N6c4aefb5100(Object[] i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 3;
        } else if (((Double) i[4]).doubleValue() <= 0.833591) {
            p = 3;
        } else if (((Double) i[4]).doubleValue() > 0.833591) {
            p = N64ecdb2e101(i);
        }
        return p;
    }

    static double N64ecdb2e101(Object[] i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -0.270005) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -0.270005) {
            p = N1264d77f102(i);
        }
        return p;
    }

    static double N1264d77f102(Object[] i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -0.534362) {
            p = N77709687103(i);
        } else if (((Double) i[1]).doubleValue() > -0.534362) {
            p = 0;
        }
        return p;
    }

    static double N77709687103(Object[] i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 7.151705) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > 7.151705) {
            p = 0;
        }
        return p;
    }

    static double N4cfcf89b104(Object[] i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 6.496885) {
            p = N4e4b6f81105(i);
        } else if (((Double) i[2]).doubleValue() > 6.496885) {
            p = N2204fafc108(i);
        }
        return p;
    }

    static double N4e4b6f81105(Object[] i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -1.588002) {
            p = N7a208618106(i);
        } else if (((Double) i[1]).doubleValue() > -1.588002) {
            p = N997e375107(i);
        }
        return p;
    }

    static double N7a208618106(Object[] i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -9.27406) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -9.27406) {
            p = 2;
        }
        return p;
    }

    static double N997e375107(Object[] i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 0.223154) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 0.223154) {
            p = 5;
        }
        return p;
    }

    static double N2204fafc108(Object[] i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 10.207135) {
            p = N37a6be5a109(i);
        } else if (((Double) i[2]).doubleValue() > 10.207135) {
            p = 2;
        }
        return p;
    }

    static double N37a6be5a109(Object[] i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -1.352654) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > -1.352654) {
            p = 1;
        }
        return p;
    }

    static double N49c8eef0110(Object[] i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 6;
        } else if (((Double) i[0]).doubleValue() <= 3.409034) {
            p = N7ff220f7111(i);
        } else if (((Double) i[0]).doubleValue() > 3.409034) {
            p = N2b96bd54117(i);
        }
        return p;
    }

    static double N7ff220f7111(Object[] i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 6;
        } else if (((Double) i[4]).doubleValue() <= 0.008856) {
            p = 6;
        } else if (((Double) i[4]).doubleValue() > 0.008856) {
            p = N7aa4f6ef112(i);
        }
        return p;
    }

    static double N7aa4f6ef112(Object[] i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 7;
        } else if (((Double) i[1]).doubleValue() <= 7.038155) {
            p = N78f2c38f113(i);
        } else if (((Double) i[1]).doubleValue() > 7.038155) {
            p = N4596e0d2116(i);
        }
        return p;
    }

    static double N78f2c38f113(Object[] i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 7;
        } else if (((Double) i[3]).doubleValue() <= 0.646035) {
            p = 7;
        } else if (((Double) i[3]).doubleValue() > 0.646035) {
            p = N76431d0f114(i);
        }
        return p;
    }

    static double N76431d0f114(Object[] i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 7;
        } else if (((Double) i[1]).doubleValue() <= 2.797038) {
            p = 7;
        } else if (((Double) i[1]).doubleValue() > 2.797038) {
            p = N18d87ea8115(i);
        }
        return p;
    }

    static double N18d87ea8115(Object[] i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 6;
        } else if (((Double) i[0]).doubleValue() <= 0.29101) {
            p = 6;
        } else if (((Double) i[0]).doubleValue() > 0.29101) {
            p = 7;
        }
        return p;
    }

    static double N4596e0d2116(Object[] i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 7;
        } else if (((Double) i[5]).doubleValue() <= 5.182561) {
            p = 7;
        } else if (((Double) i[5]).doubleValue() > 5.182561) {
            p = 6;
        }
        return p;
    }

    static double N2b96bd54117(Object[] i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 7;
        } else if (((Double) i[4]).doubleValue() <= 1.181897) {
            p = 7;
        } else if (((Double) i[4]).doubleValue() > 1.181897) {
            p = N4553664c118(i);
        }
        return p;
    }

    static double N4553664c118(Object[] i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 8;
        } else if (((Double) i[0]).doubleValue() <= 9.019775) {
            p = N1ea56d70119(i);
        } else if (((Double) i[0]).doubleValue() > 9.019775) {
            p = 8;
        }
        return p;
    }

    static double N1ea56d70119(Object[] i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 7;
        } else if (((Double) i[4]).doubleValue() <= 7.143188) {
            p = 7;
        } else if (((Double) i[4]).doubleValue() > 7.143188) {
            p = 8;
        }
        return p;
    }
}
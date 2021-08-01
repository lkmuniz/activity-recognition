package br.com.muniz.activityrecognition.data

object WekaDataIntensityWalk {
    @Throws(Exception::class)
    fun classify(i: Array<Double?>): Double {
        return N10e9bcdc36(i)
    }

    private fun N10e9bcdc36(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[2] == null) {
            p = 0.0
        } else if ((i[2])!!.toDouble() <= 6.896479) {
            p = N1de3ce3337(i)
        } else if ((i[2])!!.toDouble() > 6.896479) {
            p = N49033dc344(i)
        }
        return p
    }

    private fun N1de3ce3337(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[2] == null) {
            p = 0.0
        } else if ((i[2])!!.toDouble() <= 2.210205) {
            p = 0.0
        } else if ((i[2])!!.toDouble() > 2.210205) {
            p = N5ec2340d38(i)
        }
        return p
    }

    private fun N5ec2340d38(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[5] == null) {
            p = 1.0
        } else if ((i[5])!!.toDouble() <= -0.696032) {
            p = 1.0
        } else if ((i[5])!!.toDouble() > -0.696032) {
            p = N17fb6fb539(i)
        }
        return p
    }

    private fun N17fb6fb539(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[4] == null) {
            p = 0.0
        } else if ((i[4])!!.toDouble() <= 4.669939) {
            p = N4a293eca40(i)
        } else if ((i[4])!!.toDouble() > 4.669939) {
            p = N4a5f952c43(i)
        }
        return p
    }

    private fun N4a293eca40(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[1] == null) {
            p = 1.0
        } else if ((i[1])!!.toDouble() <= -1.855154) {
            p = 1.0
        } else if ((i[1])!!.toDouble() > -1.855154) {
            p = N4938e3ea41(i)
        }
        return p
    }

    private fun N4938e3ea41(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[2] == null) {
            p = 0.0
        } else if ((i[2])!!.toDouble() <= 3.568575) {
            p = 0.0
        } else if ((i[2])!!.toDouble() > 3.568575) {
            p = N615d49c42(i)
        }
        return p
    }

    private fun N615d49c42(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[1] == null) {
            p = 1.0
        } else if ((i[1])!!.toDouble() <= -0.516537) {
            p = 1.0
        } else if ((i[1])!!.toDouble() > -0.516537) {
            p = 0.0
        }
        return p
    }

    private fun N4a5f952c43(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[1] == null) {
            p = 0.0
        } else if ((i[1])!!.toDouble() <= -0.898951) {
            p = 0.0
        } else if ((i[1])!!.toDouble() > -0.898951) {
            p = 1.0
        }
        return p
    }

    private fun N49033dc344(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[0] == null) {
            p = 1.0
        } else if ((i[0])!!.toDouble() <= 5.819407) {
            p = 1.0
        } else if ((i[0])!!.toDouble() > 5.819407) {
            p = N47aaa0ba45(i)
        }
        return p
    }

    private fun N47aaa0ba45(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[2] == null) {
            p = 2.0
        } else if ((i[2])!!.toDouble() <= 10.983705) {
            p = N6fb33de746(i)
        } else if ((i[2])!!.toDouble() > 10.983705) {
            p = 2.0
        }
        return p
    }

    private fun N6fb33de746(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[1] == null) {
            p = 2.0
        } else if ((i[1])!!.toDouble() <= -1.425254) {
            p = 2.0
        } else if ((i[1])!!.toDouble() > -1.425254) {
            p = 1.0
        }
        return p
    }
}
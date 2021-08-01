package br.com.muniz.activityrecognition.data

object WekaDataActivity {
    @Throws(Exception::class)
    fun classify(i: Array<Double?>): Double {
        return N4d18ab6c80(i)
    }

    private fun N4d18ab6c80(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[3] == null) {
            p = 4.0
        } else if ((i[3])!!.toDouble() <= -7.44524) {
            p = N233a10d181(i)
        } else if ((i[3])!!.toDouble() > -7.44524) {
            p = N49c8eef0110(i)
        }
        return p
    }

    private fun N233a10d181(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[2] == null) {
            p = 4.0
        } else if ((i[2])!!.toDouble() <= 0.638822) {
            p = N193825882(i)
        } else if ((i[2])!!.toDouble() > 0.638822) {
            p = N504e4ea187(i)
        }
        return p
    }

    private fun N193825882(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[2] == null) {
            p = 3.0
        } else if ((i[2])!!.toDouble() <= 0.012488) {
            p = N5da6d7a783(i)
        } else if ((i[2])!!.toDouble() > 0.012488) {
            p = N26a26a5085(i)
        }
        return p
    }

    private fun N5da6d7a783(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[0] == null) {
            p = 3.0
        } else if ((i[0])!!.toDouble() <= 0.182569) {
            p = N556d44b484(i)
        } else if ((i[0])!!.toDouble() > 0.182569) {
            p = 4.0
        }
        return p
    }

    private fun N556d44b484(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[3] == null) {
            p = 4.0
        } else if ((i[3])!!.toDouble() <= -9.617532) {
            p = 4.0
        } else if ((i[3])!!.toDouble() > -9.617532) {
            p = 3.0
        }
        return p
    }

    private fun N26a26a5085(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[2] == null) {
            p = 4.0
        } else if ((i[2])!!.toDouble() <= 0.097223) {
            p = N3bbead9e86(i)
        } else if ((i[2])!!.toDouble() > 0.097223) {
            p = 5.0
        }
        return p
    }

    private fun N3bbead9e86(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[0] == null) {
            p = 4.0
        } else if ((i[0])!!.toDouble() <= 0.883931) {
            p = 4.0
        } else if ((i[0])!!.toDouble() > 0.883931) {
            p = 5.0
        }
        return p
    }

    private fun N504e4ea187(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[0] == null) {
            p = 0.0
        } else if ((i[0])!!.toDouble() <= 6.904059) {
            p = N6f39e8f888(i)
        } else if ((i[0])!!.toDouble() > 6.904059) {
            p = N4cfcf89b104(i)
        }
        return p
    }

    private fun N6f39e8f888(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[2] == null) {
            p = 0.0
        } else if ((i[2])!!.toDouble() <= 3.436413) {
            p = N5afcffa589(i)
        } else if ((i[2])!!.toDouble() > 3.436413) {
            p = N6c4aefb5100(i)
        }
        return p
    }

    private fun N5afcffa589(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[1] == null) {
            p = 0.0
        } else if ((i[1])!!.toDouble() <= -0.689272) {
            p = N14607b3990(i)
        } else if ((i[1])!!.toDouble() > -0.689272) {
            p = N4210575295(i)
        }
        return p
    }

    private fun N14607b3990(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[4] == null) {
            p = 0.0
        } else if ((i[4])!!.toDouble() <= 1.967939) {
            p = 0.0
        } else if ((i[4])!!.toDouble() > 1.967939) {
            p = N3679045291(i)
        }
        return p
    }

    private fun N3679045291(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[1] == null) {
            p = 1.0
        } else if ((i[1])!!.toDouble() <= -1.923319) {
            p = 1.0
        } else if ((i[1])!!.toDouble() > -1.923319) {
            p = N16a7544d92(i)
        }
        return p
    }

    private fun N16a7544d92(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[0] == null) {
            p = 1.0
        } else if ((i[0])!!.toDouble() <= 1.544581) {
            p = 1.0
        } else if ((i[0])!!.toDouble() > 1.544581) {
            p = N2b1b90eb93(i)
        }
        return p
    }

    private fun N2b1b90eb93(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[4] == null) {
            p = 0.0
        } else if ((i[4])!!.toDouble() <= 3.1772) {
            p = 0.0
        } else if ((i[4])!!.toDouble() > 3.1772) {
            p = N3cb59f0294(i)
        }
        return p
    }

    private fun N3cb59f0294(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[0] == null) {
            p = 1.0
        } else if ((i[0])!!.toDouble() <= 3.305) {
            p = 1.0
        } else if ((i[0])!!.toDouble() > 3.305) {
            p = 0.0
        }
        return p
    }

    private fun N4210575295(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[5] == null) {
            p = 0.0
        } else if ((i[5])!!.toDouble() <= 2.847387) {
            p = N6eb9766196(i)
        } else if ((i[5])!!.toDouble() > 2.847387) {
            p = 2.0
        }
        return p
    }

    private fun N6eb9766196(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[0] == null) {
            p = 0.0
        } else if ((i[0])!!.toDouble() <= 2.626981) {
            p = N19d22f9597(i)
        } else if ((i[0])!!.toDouble() > 2.626981) {
            p = 5.0
        }
        return p
    }

    private fun N19d22f9597(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[0] == null) {
            p = 5.0
        } else if ((i[0])!!.toDouble() <= 0.90812) {
            p = 5.0
        } else if ((i[0])!!.toDouble() > 0.90812) {
            p = N90ffe2298(i)
        }
        return p
    }

    private fun N90ffe2298(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[2] == null) {
            p = 0.0
        } else if ((i[2])!!.toDouble() <= 1.275139) {
            p = N49e5929699(i)
        } else if ((i[2])!!.toDouble() > 1.275139) {
            p = 0.0
        }
        return p
    }

    private fun N49e5929699(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[1] == null) {
            p = 5.0
        } else if ((i[1])!!.toDouble() <= -0.260897) {
            p = 5.0
        } else if ((i[1])!!.toDouble() > -0.260897) {
            p = 0.0
        }
        return p
    }

    private fun N6c4aefb5100(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[4] == null) {
            p = 3.0
        } else if ((i[4])!!.toDouble() <= 0.833591) {
            p = 3.0
        } else if ((i[4])!!.toDouble() > 0.833591) {
            p = N64ecdb2e101(i)
        }
        return p
    }

    private fun N64ecdb2e101(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[5] == null) {
            p = 1.0
        } else if ((i[5])!!.toDouble() <= -0.270005) {
            p = 1.0
        } else if ((i[5])!!.toDouble() > -0.270005) {
            p = N1264d77f102(i)
        }
        return p
    }

    private fun N1264d77f102(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[1] == null) {
            p = 1.0
        } else if ((i[1])!!.toDouble() <= -0.534362) {
            p = N77709687103(i)
        } else if ((i[1])!!.toDouble() > -0.534362) {
            p = 0.0
        }
        return p
    }

    private fun N77709687103(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[4] == null) {
            p = 1.0
        } else if ((i[4])!!.toDouble() <= 7.151705) {
            p = 1.0
        } else if ((i[4])!!.toDouble() > 7.151705) {
            p = 0.0
        }
        return p
    }

    private fun N4cfcf89b104(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[2] == null) {
            p = 1.0
        } else if ((i[2])!!.toDouble() <= 6.496885) {
            p = N4e4b6f81105(i)
        } else if ((i[2])!!.toDouble() > 6.496885) {
            p = N2204fafc108(i)
        }
        return p
    }

    private fun N4e4b6f81105(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[1] == null) {
            p = 0.0
        } else if ((i[1])!!.toDouble() <= -1.588002) {
            p = N7a208618106(i)
        } else if ((i[1])!!.toDouble() > -1.588002) {
            p = N997e375107(i)
        }
        return p
    }

    private fun N7a208618106(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[3] == null) {
            p = 0.0
        } else if ((i[3])!!.toDouble() <= -9.27406) {
            p = 0.0
        } else if ((i[3])!!.toDouble() > -9.27406) {
            p = 2.0
        }
        return p
    }

    private fun N997e375107(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[1] == null) {
            p = 1.0
        } else if ((i[1])!!.toDouble() <= 0.223154) {
            p = 1.0
        } else if ((i[1])!!.toDouble() > 0.223154) {
            p = 5.0
        }
        return p
    }

    private fun N2204fafc108(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[2] == null) {
            p = 2.0
        } else if ((i[2])!!.toDouble() <= 10.207135) {
            p = N37a6be5a109(i)
        } else if ((i[2])!!.toDouble() > 10.207135) {
            p = 2.0
        }
        return p
    }

    private fun N37a6be5a109(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[1] == null) {
            p = 2.0
        } else if ((i[1])!!.toDouble() <= -1.352654) {
            p = 2.0
        } else if ((i[1])!!.toDouble() > -1.352654) {
            p = 1.0
        }
        return p
    }

    private fun N49c8eef0110(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[0] == null) {
            p = 6.0
        } else if ((i[0])!!.toDouble() <= 3.409034) {
            p = N7ff220f7111(i)
        } else if ((i[0])!!.toDouble() > 3.409034) {
            p = N2b96bd54117(i)
        }
        return p
    }

    private fun N7ff220f7111(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[4] == null) {
            p = 6.0
        } else if ((i[4])!!.toDouble() <= 0.008856) {
            p = 6.0
        } else if ((i[4])!!.toDouble() > 0.008856) {
            p = N7aa4f6ef112(i)
        }
        return p
    }

    private fun N7aa4f6ef112(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[1] == null) {
            p = 7.0
        } else if ((i[1])!!.toDouble() <= 7.038155) {
            p = N78f2c38f113(i)
        } else if ((i[1])!!.toDouble() > 7.038155) {
            p = N4596e0d2116(i)
        }
        return p
    }

    private fun N78f2c38f113(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[3] == null) {
            p = 7.0
        } else if ((i[3])!!.toDouble() <= 0.646035) {
            p = 7.0
        } else if ((i[3])!!.toDouble() > 0.646035) {
            p = N76431d0f114(i)
        }
        return p
    }

    private fun N76431d0f114(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[1] == null) {
            p = 7.0
        } else if ((i[1])!!.toDouble() <= 2.797038) {
            p = 7.0
        } else if ((i[1])!!.toDouble() > 2.797038) {
            p = N18d87ea8115(i)
        }
        return p
    }

    private fun N18d87ea8115(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[0] == null) {
            p = 6.0
        } else if ((i[0])!!.toDouble() <= 0.29101) {
            p = 6.0
        } else if ((i[0])!!.toDouble() > 0.29101) {
            p = 7.0
        }
        return p
    }

    private fun N4596e0d2116(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[5] == null) {
            p = 7.0
        } else if ((i[5])!!.toDouble() <= 5.182561) {
            p = 7.0
        } else if ((i[5])!!.toDouble() > 5.182561) {
            p = 6.0
        }
        return p
    }

    private fun N2b96bd54117(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[4] == null) {
            p = 7.0
        } else if ((i[4])!!.toDouble() <= 1.181897) {
            p = 7.0
        } else if ((i[4])!!.toDouble() > 1.181897) {
            p = N4553664c118(i)
        }
        return p
    }

    private fun N4553664c118(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[0] == null) {
            p = 8.0
        } else if ((i[0])!!.toDouble() <= 9.019775) {
            p = N1ea56d70119(i)
        } else if ((i[0])!!.toDouble() > 9.019775) {
            p = 8.0
        }
        return p
    }

    private fun N1ea56d70119(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[4] == null) {
            p = 7.0
        } else if ((i[4])!!.toDouble() <= 7.143188) {
            p = 7.0
        } else if ((i[4])!!.toDouble() > 7.143188) {
            p = 8.0
        }
        return p
    }
}
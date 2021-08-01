package br.com.muniz.activityrecognition.data

object WekaDataIntensitySit {
    @Throws(Exception::class)
    fun classify(i: Array<Double?>): Double {
        var p = Double.NaN
        p = N531808350(i)
        return p
    }

    private fun N531808350(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[2] == null) {
            p = 0.0
        } else if ((i[2])!!.toDouble() <= 0.009915) {
            p = N301c86bf1(i)
        } else if ((i[2])!!.toDouble() > 0.009915) {
            p = N49310ee94(i)
        }
        return p
    }

    private fun N301c86bf1(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[0] == null) {
            p = 0.0
        } else if ((i[0])!!.toDouble() <= 0.06194) {
            p = 0.0
        } else if ((i[0])!!.toDouble() > 0.06194) {
            p = N1c326ffc2(i)
        }
        return p
    }

    private fun N1c326ffc2(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[1] == null) {
            p = 0.0
        } else if ((i[1])!!.toDouble() <= -1.126143) {
            p = 0.0
        } else if ((i[1])!!.toDouble() > -1.126143) {
            p = N5a7bfc333(i)
        }
        return p
    }

    private fun N5a7bfc333(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[0] == null) {
            p = 0.0
        } else if ((i[0])!!.toDouble() <= 0.077503) {
            p = 0.0
        } else if ((i[0])!!.toDouble() > 0.077503) {
            p = 1.0
        }
        return p
    }

    private fun N49310ee94(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[2] == null) {
            p = 1.0
        } else if ((i[2])!!.toDouble() <= 0.095029) {
            p = N1d4c500e5(i)
        } else if ((i[2])!!.toDouble() > 0.095029) {
            p = 2.0
        }
        return p
    }

    private fun N1d4c500e5(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[0] == null) {
            p = 1.0
        } else if ((i[0])!!.toDouble() <= 0.892093) {
            p = N128e91d46(i)
        } else if ((i[0])!!.toDouble() > 0.892093) {
            p = 2.0
        }
        return p
    }

    private fun N128e91d46(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[5] == null) {
            p = 1.0
        } else if ((i[5])!!.toDouble() <= 1.358545) {
            p = 1.0
        } else if ((i[5])!!.toDouble() > 1.358545) {
            p = N17917dd27(i)
        }
        return p
    }

    private fun N17917dd27(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[4] == null) {
            p = 1.0
        } else if ((i[4])!!.toDouble() <= 0.972764) {
            p = N56167f8f8(i)
        } else if ((i[4])!!.toDouble() > 0.972764) {
            p = 0.0
        }
        return p
    }

    private fun N56167f8f8(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[3] == null) {
            p = 1.0
        } else if ((i[3])!!.toDouble() <= -9.367361) {
            p = N29a589639(i)
        } else if ((i[3])!!.toDouble() > -9.367361) {
            p = N53a0366511(i)
        }
        return p
    }

    private fun N29a589639(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[1] == null) {
            p = 1.0
        } else if ((i[1])!!.toDouble() <= 0.920499) {
            p = 1.0
        } else if ((i[1])!!.toDouble() > 0.920499) {
            p = N4f43adb210(i)
        }
        return p
    }

    private fun N4f43adb210(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[0] == null) {
            p = 0.0
        } else if ((i[0])!!.toDouble() <= 0.24213) {
            p = 0.0
        } else if ((i[0])!!.toDouble() > 0.24213) {
            p = 1.0
        }
        return p
    }

    private fun N53a0366511(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[0] == null) {
            p = 0.0
        } else if ((i[0])!!.toDouble() <= 0.028243) {
            p = 0.0
        } else if ((i[0])!!.toDouble() > 0.028243) {
            p = 1.0
        }
        return p
    }
}
package br.com.muniz.activityrecognition.data

object WekaDataIntensityLying {
    @Throws(Exception::class)
    fun classify(i: Array<Double?>): Double {
        return N5466558d12(i)
    }

    private fun N5466558d12(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[0] == null) {
            p = 0.0
        } else if ((i[0])!!.toDouble() <= 2.875789) {
            p = N279cbb913(i)
        } else if ((i[0])!!.toDouble() > 2.875789) {
            p = N3e40e97121(i)
        }
        return p
    }

    private fun N279cbb913(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[4] == null) {
            p = 0.0
        } else if ((i[4])!!.toDouble() <= 0.01213) {
            p = 0.0
        } else if ((i[4])!!.toDouble() > 0.01213) {
            p = N31b613f814(i)
        }
        return p
    }

    private fun N31b613f814(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[1] == null) {
            p = 1.0
        } else if ((i[1])!!.toDouble() <= 7.038155) {
            p = N2d23014115(i)
        } else if ((i[1])!!.toDouble() > 7.038155) {
            p = N7725fac20(i)
        }
        return p
    }

    private fun N2d23014115(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[3] == null) {
            p = 1.0
        } else if ((i[3])!!.toDouble() <= 0.636882) {
            p = 1.0
        } else if ((i[3])!!.toDouble() > 0.636882) {
            p = N4b0fe35516(i)
        }
        return p
    }

    private fun N4b0fe35516(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[1] == null) {
            p = 1.0
        } else if ((i[1])!!.toDouble() <= 5.21443) {
            p = N767cd8e17(i)
        } else if ((i[1])!!.toDouble() > 5.21443) {
            p = 0.0
        }
        return p
    }

    private fun N767cd8e17(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[1] == null) {
            p = 1.0
        } else if ((i[1])!!.toDouble() <= 2.615929) {
            p = 1.0
        } else if ((i[1])!!.toDouble() > 2.615929) {
            p = N6cf374918(i)
        }
        return p
    }

    private fun N6cf374918(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[1] == null) {
            p = 0.0
        } else if ((i[1])!!.toDouble() <= 4.885157) {
            p = N335307d819(i)
        } else if ((i[1])!!.toDouble() > 4.885157) {
            p = 1.0
        }
        return p
    }

    private fun N335307d819(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[0] == null) {
            p = 0.0
        } else if ((i[0])!!.toDouble() <= 0.304879) {
            p = 0.0
        } else if ((i[0])!!.toDouble() > 0.304879) {
            p = 1.0
        }
        return p
    }

    private fun N7725fac20(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[4] == null) {
            p = 0.0
        } else if ((i[4])!!.toDouble() <= 0.561273) {
            p = 0.0
        } else if ((i[4])!!.toDouble() > 0.561273) {
            p = 1.0
        }
        return p
    }

    private fun N3e40e97121(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[5] == null) {
            p = 2.0
        } else if ((i[5])!!.toDouble() <= 8.511364) {
            p = N41cae48f22(i)
        } else if ((i[5])!!.toDouble() > 8.511364) {
            p = N7f16eb7b24(i)
        }
        return p
    }

    private fun N41cae48f22(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[3] == null) {
            p = 2.0
        } else if ((i[3])!!.toDouble() <= 1.73075) {
            p = 2.0
        } else if ((i[3])!!.toDouble() > 1.73075) {
            p = N6a0c56a923(i)
        }
        return p
    }

    private fun N6a0c56a923(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[4] == null) {
            p = 1.0
        } else if ((i[4])!!.toDouble() <= 6.971054) {
            p = 1.0
        } else if ((i[4])!!.toDouble() > 6.971054) {
            p = 2.0
        }
        return p
    }

    private fun N7f16eb7b24(i: Array<Double?>): Double {
        var p = Double.NaN
        if (i[2] == null) {
            p = 1.0
        } else if ((i[2])!!.toDouble() <= 0.266028) {
            p = 1.0
        } else if ((i[2])!!.toDouble() > 0.266028) {
            p = 2.0
        }
        return p
    }
}
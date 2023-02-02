package com.desafio.projetodesafio.enums;

    public enum PowerLevel {
        OMEGA("Omega"),
        EPSILON("Epsilon"),
        DELTA("Delta"),
        NO_power("NO-power");

        private String powerLevel ;

        PowerLevel(String powerLevel) {
            this.powerLevel = powerLevel;
        }

        public String getPowerLevel() {
            return powerLevel;
        }

        public void setPowerLevel(String powerLevel) {
            this.powerLevel = powerLevel;
        }

    }

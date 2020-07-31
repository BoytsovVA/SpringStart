package com.SpringStart.Controller.services;

import org.springframework.stereotype.Service;

@Service
public class BuisnessServices {
    public Double getD(Double a, Double b, Double c) {
        return b * b - 4 * a * c;
    }

    public Double getX1(Double a, Double b, Double c) {
        Double d = getD(a, b, c);
        if (d > 0) {
            return (-b + Math.sqrt(d)) / (2 * a);
        } else if (d == 0) {
            return -b / (2 * a);
        } else if (d < 0) {
            throw new RuntimeException();
        }
        return 1.0;
    }

    public Double getX2(Double a, Double b, Double c) {
        Double d = getD(a, b, c);
        if (d > 0) {
            return (-b - Math.sqrt(d)) / (2 * a);
        } else if (d == 0) {
            return -b / (2 * a);
        } else if (d < 0) {
            throw new RuntimeException();
        }
        return 1.0;
    }
}

package it.unibo.oop.workers02;

import java.util.ArrayList;
import java.util.List;

public class MultiThreadedSumMatrix implements SumMatrix {

    private final int nThreads;

    public MultiThreadedSumMatrix(final int nThreads) {
        this.nThreads = nThreads;
    }

    private static class Worker extends Thread {

        private final List<List<Double>> matrix;
        private final int startPosition;
        private final int nElements;
        private List<List<Double>> result;

        Worker(final List<List<Double>> matrix, final int startPosition, final int nElements) {
            super();
            this.matr
        }
    }

    @Override
    public double sum(double[][] matrix) {
        final int matrixSize = matrix.length * matrix[0].length;
        final int size = matrixSize % nThreads + matrixSize / nThreads;

        final List<Worker> workers = new ArrayList<>(nThreads);

        for (int start = 0; start < matrixSize; start += size) {
            workers.add(new Worker(matrix, start, size));
        }
    }
}

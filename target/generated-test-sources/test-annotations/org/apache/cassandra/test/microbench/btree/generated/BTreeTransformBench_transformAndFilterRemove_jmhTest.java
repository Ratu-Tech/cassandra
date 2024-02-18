package org.apache.cassandra.test.microbench.btree.generated;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.CompilerControl;
import org.openjdk.jmh.runner.InfraControl;
import org.openjdk.jmh.infra.ThreadParams;
import org.openjdk.jmh.results.BenchmarkTaskResult;
import org.openjdk.jmh.results.Result;
import org.openjdk.jmh.results.ThroughputResult;
import org.openjdk.jmh.results.AverageTimeResult;
import org.openjdk.jmh.results.SampleTimeResult;
import org.openjdk.jmh.results.SingleShotResult;
import org.openjdk.jmh.util.SampleBuffer;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.results.RawResults;
import org.openjdk.jmh.results.ResultRole;
import java.lang.reflect.Field;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.IterationParams;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.infra.Control;
import org.openjdk.jmh.results.ScalarResult;
import org.openjdk.jmh.results.AggregationPolicy;
import org.openjdk.jmh.runner.FailureAssistException;

import org.apache.cassandra.test.microbench.btree.generated.BTreeBench_jmhType;
import org.apache.cassandra.test.microbench.btree.generated.BTreeTransformBench_jmhType;
import org.apache.cassandra.test.microbench.btree.generated.BTreeBench_BuildSizeState_jmhType;
import org.apache.cassandra.test.microbench.btree.generated.BTreeBench_BuildSizeState_jmhType;
import org.apache.cassandra.test.microbench.btree.generated.BTreeTransformBench_ThreadState_jmhType;
public final class BTreeTransformBench_transformAndFilterRemove_jmhTest {

    boolean p000, p001, p002, p003, p004, p005, p006, p007, p008, p009, p010, p011, p012, p013, p014, p015;
    boolean p016, p017, p018, p019, p020, p021, p022, p023, p024, p025, p026, p027, p028, p029, p030, p031;
    boolean p032, p033, p034, p035, p036, p037, p038, p039, p040, p041, p042, p043, p044, p045, p046, p047;
    boolean p048, p049, p050, p051, p052, p053, p054, p055, p056, p057, p058, p059, p060, p061, p062, p063;
    boolean p064, p065, p066, p067, p068, p069, p070, p071, p072, p073, p074, p075, p076, p077, p078, p079;
    boolean p080, p081, p082, p083, p084, p085, p086, p087, p088, p089, p090, p091, p092, p093, p094, p095;
    boolean p096, p097, p098, p099, p100, p101, p102, p103, p104, p105, p106, p107, p108, p109, p110, p111;
    boolean p112, p113, p114, p115, p116, p117, p118, p119, p120, p121, p122, p123, p124, p125, p126, p127;
    boolean p128, p129, p130, p131, p132, p133, p134, p135, p136, p137, p138, p139, p140, p141, p142, p143;
    boolean p144, p145, p146, p147, p148, p149, p150, p151, p152, p153, p154, p155, p156, p157, p158, p159;
    boolean p160, p161, p162, p163, p164, p165, p166, p167, p168, p169, p170, p171, p172, p173, p174, p175;
    boolean p176, p177, p178, p179, p180, p181, p182, p183, p184, p185, p186, p187, p188, p189, p190, p191;
    boolean p192, p193, p194, p195, p196, p197, p198, p199, p200, p201, p202, p203, p204, p205, p206, p207;
    boolean p208, p209, p210, p211, p212, p213, p214, p215, p216, p217, p218, p219, p220, p221, p222, p223;
    boolean p224, p225, p226, p227, p228, p229, p230, p231, p232, p233, p234, p235, p236, p237, p238, p239;
    boolean p240, p241, p242, p243, p244, p245, p246, p247, p248, p249, p250, p251, p252, p253, p254, p255;
    int startRndMask;
    BenchmarkParams benchmarkParams;
    IterationParams iterationParams;
    ThreadParams threadParams;
    Blackhole blackhole;
    Control notifyControl;

    public BenchmarkTaskResult transformAndFilterRemove_Throughput(InfraControl control, ThreadParams threadParams) throws Throwable {
        this.benchmarkParams = control.benchmarkParams;
        this.iterationParams = control.iterationParams;
        this.threadParams    = threadParams;
        this.notifyControl   = control.notifyControl;
        if (this.blackhole == null) {
            this.blackhole = new Blackhole("Today's password is swordfish. I understand instantiating Blackholes directly is dangerous.");
        }
        if (threadParams.getSubgroupIndex() == 0) {
            RawResults res = new RawResults();
            BTreeBench_jmhType l_btreebench3_G = _jmh_tryInit_f_btreebench3_G(control);
            BTreeBench_BuildSizeState_jmhType l_buildsizestate2_2 = _jmh_tryInit_f_buildsizestate2_2(control, l_btreebench3_G);
            BTreeBench_BuildSizeState_jmhType l_buildsizestate2_1 = _jmh_tryInit_f_buildsizestate2_1(control, l_btreebench3_G);
            BTreeTransformBench_jmhType l_btreetransformbench0_G = _jmh_tryInit_f_btreetransformbench0_G(control);
            BTreeTransformBench_ThreadState_jmhType l_threadstate1_0 = _jmh_tryInit_f_threadstate1_0(control, l_btreetransformbench0_G, l_buildsizestate2_1, l_buildsizestate2_2);

            control.preSetup();


            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_threadstate1_0.doInvocationSetup(l_buildsizestate2_2);
                blackhole.consume(l_btreetransformbench0_G.transformAndFilterRemove(l_threadstate1_0));
                res.allOps++;
            }

            notifyControl.startMeasurement = true;
            transformAndFilterRemove_thrpt_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, l_threadstate1_0, l_btreetransformbench0_G, l_buildsizestate2_1, l_buildsizestate2_2, l_btreebench3_G);
            notifyControl.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_threadstate1_0.doInvocationSetup(l_buildsizestate2_2);
                    blackhole.consume(l_btreetransformbench0_G.transformAndFilterRemove(l_threadstate1_0));
                    res.allOps++;
                }
                control.preTearDown();
            } catch (InterruptedException ie) {
                control.preTearDownForce();
            }

            if (control.isLastIteration()) {
                if (BTreeTransformBench_jmhType.tearTrialMutexUpdater.compareAndSet(l_btreetransformbench0_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_btreetransformbench0_G.readyTrial) {
                            l_btreetransformbench0_G.readyTrial = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        BTreeTransformBench_jmhType.tearTrialMutexUpdater.set(l_btreetransformbench0_G, 0);
                    }
                } else {
                    long l_btreetransformbench0_G_backoff = 1;
                    while (BTreeTransformBench_jmhType.tearTrialMutexUpdater.get(l_btreetransformbench0_G) == 1) {
                        TimeUnit.MILLISECONDS.sleep(l_btreetransformbench0_G_backoff);
                        l_btreetransformbench0_G_backoff = Math.max(1024, l_btreetransformbench0_G_backoff * 2);
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                if (BTreeBench_jmhType.tearTrialMutexUpdater.compareAndSet(l_btreebench3_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_btreebench3_G.readyTrial) {
                            l_btreebench3_G.readyTrial = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        BTreeBench_jmhType.tearTrialMutexUpdater.set(l_btreebench3_G, 0);
                    }
                } else {
                    long l_btreebench3_G_backoff = 1;
                    while (BTreeBench_jmhType.tearTrialMutexUpdater.get(l_btreebench3_G) == 1) {
                        TimeUnit.MILLISECONDS.sleep(l_btreebench3_G_backoff);
                        l_btreebench3_G_backoff = Math.max(1024, l_btreebench3_G_backoff * 2);
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                synchronized(this.getClass()) {
                    f_btreetransformbench0_G = null;
                }
                synchronized(this.getClass()) {
                    f_btreebench3_G = null;
                }
                f_threadstate1_0 = null;
                f_buildsizestate2_1 = null;
                f_buildsizestate2_2 = null;
            }
            res.allOps += res.measuredOps;
            int batchSize = iterationParams.getBatchSize();
            int opsPerInv = benchmarkParams.getOpsPerInvocation();
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            res.measuredOps /= batchSize;
            BenchmarkTaskResult results = new BenchmarkTaskResult(res.allOps, res.measuredOps);
            results.add(new ThroughputResult(ResultRole.PRIMARY, "transformAndFilterRemove", res.measuredOps, res.getTime(), benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public static void transformAndFilterRemove_thrpt_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, BTreeTransformBench_ThreadState_jmhType l_threadstate1_0, BTreeTransformBench_jmhType l_btreetransformbench0_G, BTreeBench_BuildSizeState_jmhType l_buildsizestate2_1, BTreeBench_BuildSizeState_jmhType l_buildsizestate2_2, BTreeBench_jmhType l_btreebench3_G) throws Throwable {
        long operations = 0;
        long realTime = 0;
        result.startTime = System.nanoTime();
        do {
            l_threadstate1_0.doInvocationSetup(l_buildsizestate2_2);
            long rt = System.nanoTime();
            blackhole.consume(l_btreetransformbench0_G.transformAndFilterRemove(l_threadstate1_0));
            realTime += (System.nanoTime() - rt);
            operations++;
        } while(!control.isDone);
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
        result.measuredOps = operations;
    }


    public BenchmarkTaskResult transformAndFilterRemove_AverageTime(InfraControl control, ThreadParams threadParams) throws Throwable {
        this.benchmarkParams = control.benchmarkParams;
        this.iterationParams = control.iterationParams;
        this.threadParams    = threadParams;
        this.notifyControl   = control.notifyControl;
        if (this.blackhole == null) {
            this.blackhole = new Blackhole("Today's password is swordfish. I understand instantiating Blackholes directly is dangerous.");
        }
        if (threadParams.getSubgroupIndex() == 0) {
            RawResults res = new RawResults();
            BTreeBench_jmhType l_btreebench3_G = _jmh_tryInit_f_btreebench3_G(control);
            BTreeBench_BuildSizeState_jmhType l_buildsizestate2_2 = _jmh_tryInit_f_buildsizestate2_2(control, l_btreebench3_G);
            BTreeBench_BuildSizeState_jmhType l_buildsizestate2_1 = _jmh_tryInit_f_buildsizestate2_1(control, l_btreebench3_G);
            BTreeTransformBench_jmhType l_btreetransformbench0_G = _jmh_tryInit_f_btreetransformbench0_G(control);
            BTreeTransformBench_ThreadState_jmhType l_threadstate1_0 = _jmh_tryInit_f_threadstate1_0(control, l_btreetransformbench0_G, l_buildsizestate2_1, l_buildsizestate2_2);

            control.preSetup();


            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_threadstate1_0.doInvocationSetup(l_buildsizestate2_2);
                blackhole.consume(l_btreetransformbench0_G.transformAndFilterRemove(l_threadstate1_0));
                res.allOps++;
            }

            notifyControl.startMeasurement = true;
            transformAndFilterRemove_avgt_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, l_threadstate1_0, l_btreetransformbench0_G, l_buildsizestate2_1, l_buildsizestate2_2, l_btreebench3_G);
            notifyControl.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_threadstate1_0.doInvocationSetup(l_buildsizestate2_2);
                    blackhole.consume(l_btreetransformbench0_G.transformAndFilterRemove(l_threadstate1_0));
                    res.allOps++;
                }
                control.preTearDown();
            } catch (InterruptedException ie) {
                control.preTearDownForce();
            }

            if (control.isLastIteration()) {
                if (BTreeTransformBench_jmhType.tearTrialMutexUpdater.compareAndSet(l_btreetransformbench0_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_btreetransformbench0_G.readyTrial) {
                            l_btreetransformbench0_G.readyTrial = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        BTreeTransformBench_jmhType.tearTrialMutexUpdater.set(l_btreetransformbench0_G, 0);
                    }
                } else {
                    long l_btreetransformbench0_G_backoff = 1;
                    while (BTreeTransformBench_jmhType.tearTrialMutexUpdater.get(l_btreetransformbench0_G) == 1) {
                        TimeUnit.MILLISECONDS.sleep(l_btreetransformbench0_G_backoff);
                        l_btreetransformbench0_G_backoff = Math.max(1024, l_btreetransformbench0_G_backoff * 2);
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                if (BTreeBench_jmhType.tearTrialMutexUpdater.compareAndSet(l_btreebench3_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_btreebench3_G.readyTrial) {
                            l_btreebench3_G.readyTrial = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        BTreeBench_jmhType.tearTrialMutexUpdater.set(l_btreebench3_G, 0);
                    }
                } else {
                    long l_btreebench3_G_backoff = 1;
                    while (BTreeBench_jmhType.tearTrialMutexUpdater.get(l_btreebench3_G) == 1) {
                        TimeUnit.MILLISECONDS.sleep(l_btreebench3_G_backoff);
                        l_btreebench3_G_backoff = Math.max(1024, l_btreebench3_G_backoff * 2);
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                synchronized(this.getClass()) {
                    f_btreetransformbench0_G = null;
                }
                synchronized(this.getClass()) {
                    f_btreebench3_G = null;
                }
                f_threadstate1_0 = null;
                f_buildsizestate2_1 = null;
                f_buildsizestate2_2 = null;
            }
            res.allOps += res.measuredOps;
            int batchSize = iterationParams.getBatchSize();
            int opsPerInv = benchmarkParams.getOpsPerInvocation();
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            res.measuredOps /= batchSize;
            BenchmarkTaskResult results = new BenchmarkTaskResult(res.allOps, res.measuredOps);
            results.add(new AverageTimeResult(ResultRole.PRIMARY, "transformAndFilterRemove", res.measuredOps, res.getTime(), benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public static void transformAndFilterRemove_avgt_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, BTreeTransformBench_ThreadState_jmhType l_threadstate1_0, BTreeTransformBench_jmhType l_btreetransformbench0_G, BTreeBench_BuildSizeState_jmhType l_buildsizestate2_1, BTreeBench_BuildSizeState_jmhType l_buildsizestate2_2, BTreeBench_jmhType l_btreebench3_G) throws Throwable {
        long operations = 0;
        long realTime = 0;
        result.startTime = System.nanoTime();
        do {
            l_threadstate1_0.doInvocationSetup(l_buildsizestate2_2);
            long rt = System.nanoTime();
            blackhole.consume(l_btreetransformbench0_G.transformAndFilterRemove(l_threadstate1_0));
            realTime += (System.nanoTime() - rt);
            operations++;
        } while(!control.isDone);
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
        result.measuredOps = operations;
    }


    public BenchmarkTaskResult transformAndFilterRemove_SampleTime(InfraControl control, ThreadParams threadParams) throws Throwable {
        this.benchmarkParams = control.benchmarkParams;
        this.iterationParams = control.iterationParams;
        this.threadParams    = threadParams;
        this.notifyControl   = control.notifyControl;
        if (this.blackhole == null) {
            this.blackhole = new Blackhole("Today's password is swordfish. I understand instantiating Blackholes directly is dangerous.");
        }
        if (threadParams.getSubgroupIndex() == 0) {
            RawResults res = new RawResults();
            BTreeBench_jmhType l_btreebench3_G = _jmh_tryInit_f_btreebench3_G(control);
            BTreeBench_BuildSizeState_jmhType l_buildsizestate2_2 = _jmh_tryInit_f_buildsizestate2_2(control, l_btreebench3_G);
            BTreeBench_BuildSizeState_jmhType l_buildsizestate2_1 = _jmh_tryInit_f_buildsizestate2_1(control, l_btreebench3_G);
            BTreeTransformBench_jmhType l_btreetransformbench0_G = _jmh_tryInit_f_btreetransformbench0_G(control);
            BTreeTransformBench_ThreadState_jmhType l_threadstate1_0 = _jmh_tryInit_f_threadstate1_0(control, l_btreetransformbench0_G, l_buildsizestate2_1, l_buildsizestate2_2);

            control.preSetup();


            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_threadstate1_0.doInvocationSetup(l_buildsizestate2_2);
                blackhole.consume(l_btreetransformbench0_G.transformAndFilterRemove(l_threadstate1_0));
                res.allOps++;
            }

            notifyControl.startMeasurement = true;
            int targetSamples = (int) (control.getDuration(TimeUnit.MILLISECONDS) * 20); // at max, 20 timestamps per millisecond
            int batchSize = iterationParams.getBatchSize();
            int opsPerInv = benchmarkParams.getOpsPerInvocation();
            SampleBuffer buffer = new SampleBuffer();
            transformAndFilterRemove_sample_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, buffer, targetSamples, opsPerInv, batchSize, l_threadstate1_0, l_btreetransformbench0_G, l_buildsizestate2_1, l_buildsizestate2_2, l_btreebench3_G);
            notifyControl.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_threadstate1_0.doInvocationSetup(l_buildsizestate2_2);
                    blackhole.consume(l_btreetransformbench0_G.transformAndFilterRemove(l_threadstate1_0));
                    res.allOps++;
                }
                control.preTearDown();
            } catch (InterruptedException ie) {
                control.preTearDownForce();
            }

            if (control.isLastIteration()) {
                if (BTreeTransformBench_jmhType.tearTrialMutexUpdater.compareAndSet(l_btreetransformbench0_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_btreetransformbench0_G.readyTrial) {
                            l_btreetransformbench0_G.readyTrial = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        BTreeTransformBench_jmhType.tearTrialMutexUpdater.set(l_btreetransformbench0_G, 0);
                    }
                } else {
                    long l_btreetransformbench0_G_backoff = 1;
                    while (BTreeTransformBench_jmhType.tearTrialMutexUpdater.get(l_btreetransformbench0_G) == 1) {
                        TimeUnit.MILLISECONDS.sleep(l_btreetransformbench0_G_backoff);
                        l_btreetransformbench0_G_backoff = Math.max(1024, l_btreetransformbench0_G_backoff * 2);
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                if (BTreeBench_jmhType.tearTrialMutexUpdater.compareAndSet(l_btreebench3_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_btreebench3_G.readyTrial) {
                            l_btreebench3_G.readyTrial = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        BTreeBench_jmhType.tearTrialMutexUpdater.set(l_btreebench3_G, 0);
                    }
                } else {
                    long l_btreebench3_G_backoff = 1;
                    while (BTreeBench_jmhType.tearTrialMutexUpdater.get(l_btreebench3_G) == 1) {
                        TimeUnit.MILLISECONDS.sleep(l_btreebench3_G_backoff);
                        l_btreebench3_G_backoff = Math.max(1024, l_btreebench3_G_backoff * 2);
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                synchronized(this.getClass()) {
                    f_btreetransformbench0_G = null;
                }
                synchronized(this.getClass()) {
                    f_btreebench3_G = null;
                }
                f_threadstate1_0 = null;
                f_buildsizestate2_1 = null;
                f_buildsizestate2_2 = null;
            }
            res.allOps += res.measuredOps * batchSize;
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            BenchmarkTaskResult results = new BenchmarkTaskResult(res.allOps, res.measuredOps);
            results.add(new SampleTimeResult(ResultRole.PRIMARY, "transformAndFilterRemove", buffer, benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public static void transformAndFilterRemove_sample_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, SampleBuffer buffer, int targetSamples, long opsPerInv, int batchSize, BTreeTransformBench_ThreadState_jmhType l_threadstate1_0, BTreeTransformBench_jmhType l_btreetransformbench0_G, BTreeBench_BuildSizeState_jmhType l_buildsizestate2_1, BTreeBench_BuildSizeState_jmhType l_buildsizestate2_2, BTreeBench_jmhType l_btreebench3_G) throws Throwable {
        long realTime = 0;
        long operations = 0;
        int rnd = (int)System.nanoTime();
        int rndMask = startRndMask;
        long time = 0;
        int currentStride = 0;
        do {
            l_threadstate1_0.doInvocationSetup(l_buildsizestate2_2);
            long rt = System.nanoTime();
            rnd = (rnd * 1664525 + 1013904223);
            boolean sample = (rnd & rndMask) == 0;
            if (sample) {
                time = System.nanoTime();
            }
            for (int b = 0; b < batchSize; b++) {
                if (control.volatileSpoiler) return;
                blackhole.consume(l_btreetransformbench0_G.transformAndFilterRemove(l_threadstate1_0));
            }
            if (sample) {
                buffer.add((System.nanoTime() - time) / opsPerInv);
                if (currentStride++ > targetSamples) {
                    buffer.half();
                    currentStride = 0;
                    rndMask = (rndMask << 1) + 1;
                }
            }
            realTime += (System.nanoTime() - rt);
            operations++;
        } while(!control.isDone);
        startRndMask = Math.max(startRndMask, rndMask);
        result.realTime = realTime;
        result.measuredOps = operations;
    }


    public BenchmarkTaskResult transformAndFilterRemove_SingleShotTime(InfraControl control, ThreadParams threadParams) throws Throwable {
        this.benchmarkParams = control.benchmarkParams;
        this.iterationParams = control.iterationParams;
        this.threadParams    = threadParams;
        this.notifyControl   = control.notifyControl;
        if (this.blackhole == null) {
            this.blackhole = new Blackhole("Today's password is swordfish. I understand instantiating Blackholes directly is dangerous.");
        }
        if (threadParams.getSubgroupIndex() == 0) {
            BTreeBench_jmhType l_btreebench3_G = _jmh_tryInit_f_btreebench3_G(control);
            BTreeBench_BuildSizeState_jmhType l_buildsizestate2_2 = _jmh_tryInit_f_buildsizestate2_2(control, l_btreebench3_G);
            BTreeBench_BuildSizeState_jmhType l_buildsizestate2_1 = _jmh_tryInit_f_buildsizestate2_1(control, l_btreebench3_G);
            BTreeTransformBench_jmhType l_btreetransformbench0_G = _jmh_tryInit_f_btreetransformbench0_G(control);
            BTreeTransformBench_ThreadState_jmhType l_threadstate1_0 = _jmh_tryInit_f_threadstate1_0(control, l_btreetransformbench0_G, l_buildsizestate2_1, l_buildsizestate2_2);

            control.preSetup();


            notifyControl.startMeasurement = true;
            RawResults res = new RawResults();
            int batchSize = iterationParams.getBatchSize();
            transformAndFilterRemove_ss_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, batchSize, l_threadstate1_0, l_btreetransformbench0_G, l_buildsizestate2_1, l_buildsizestate2_2, l_btreebench3_G);
            control.preTearDown();

            if (control.isLastIteration()) {
                if (BTreeTransformBench_jmhType.tearTrialMutexUpdater.compareAndSet(l_btreetransformbench0_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_btreetransformbench0_G.readyTrial) {
                            l_btreetransformbench0_G.readyTrial = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        BTreeTransformBench_jmhType.tearTrialMutexUpdater.set(l_btreetransformbench0_G, 0);
                    }
                } else {
                    long l_btreetransformbench0_G_backoff = 1;
                    while (BTreeTransformBench_jmhType.tearTrialMutexUpdater.get(l_btreetransformbench0_G) == 1) {
                        TimeUnit.MILLISECONDS.sleep(l_btreetransformbench0_G_backoff);
                        l_btreetransformbench0_G_backoff = Math.max(1024, l_btreetransformbench0_G_backoff * 2);
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                if (BTreeBench_jmhType.tearTrialMutexUpdater.compareAndSet(l_btreebench3_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_btreebench3_G.readyTrial) {
                            l_btreebench3_G.readyTrial = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        BTreeBench_jmhType.tearTrialMutexUpdater.set(l_btreebench3_G, 0);
                    }
                } else {
                    long l_btreebench3_G_backoff = 1;
                    while (BTreeBench_jmhType.tearTrialMutexUpdater.get(l_btreebench3_G) == 1) {
                        TimeUnit.MILLISECONDS.sleep(l_btreebench3_G_backoff);
                        l_btreebench3_G_backoff = Math.max(1024, l_btreebench3_G_backoff * 2);
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                synchronized(this.getClass()) {
                    f_btreetransformbench0_G = null;
                }
                synchronized(this.getClass()) {
                    f_btreebench3_G = null;
                }
                f_threadstate1_0 = null;
                f_buildsizestate2_1 = null;
                f_buildsizestate2_2 = null;
            }
            int opsPerInv = control.benchmarkParams.getOpsPerInvocation();
            long totalOps = opsPerInv;
            BenchmarkTaskResult results = new BenchmarkTaskResult(totalOps, totalOps);
            results.add(new SingleShotResult(ResultRole.PRIMARY, "transformAndFilterRemove", res.getTime(), benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public static void transformAndFilterRemove_ss_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, int batchSize, BTreeTransformBench_ThreadState_jmhType l_threadstate1_0, BTreeTransformBench_jmhType l_btreetransformbench0_G, BTreeBench_BuildSizeState_jmhType l_buildsizestate2_1, BTreeBench_BuildSizeState_jmhType l_buildsizestate2_2, BTreeBench_jmhType l_btreebench3_G) throws Throwable {
        long realTime = 0;
        result.startTime = System.nanoTime();
        for (int b = 0; b < batchSize; b++) {
            if (control.volatileSpoiler) return;
            l_threadstate1_0.doInvocationSetup(l_buildsizestate2_2);
            long rt = System.nanoTime();
            blackhole.consume(l_btreetransformbench0_G.transformAndFilterRemove(l_threadstate1_0));
            realTime += (System.nanoTime() - rt);
        }
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
    }

    
    static volatile BTreeBench_jmhType f_btreebench3_G;
    
    BTreeBench_jmhType _jmh_tryInit_f_btreebench3_G(InfraControl control) throws Throwable {
        BTreeBench_jmhType val = f_btreebench3_G;
        if (val != null) {
            return val;
        }
        synchronized(this.getClass()) {
            try {
            if (control.isFailing) throw new FailureAssistException();
            val = f_btreebench3_G;
            if (val != null) {
                return val;
            }
            val = new BTreeBench_jmhType();
            Field f;
            f = org.apache.cassandra.test.microbench.btree.BTreeBench.class.getDeclaredField("dataSize");
            f.setAccessible(true);
            f.set(val, Integer.valueOf(control.getParam("dataSize")));
            val.setup();
            val.readyTrial = true;
            f_btreebench3_G = val;
            } catch (Throwable t) {
                control.isFailing = true;
                throw t;
            }
        }
        return val;
    }
    
    static volatile BTreeTransformBench_jmhType f_btreetransformbench0_G;
    
    BTreeTransformBench_jmhType _jmh_tryInit_f_btreetransformbench0_G(InfraControl control) throws Throwable {
        BTreeTransformBench_jmhType val = f_btreetransformbench0_G;
        if (val != null) {
            return val;
        }
        synchronized(this.getClass()) {
            try {
            if (control.isFailing) throw new FailureAssistException();
            val = f_btreetransformbench0_G;
            if (val != null) {
                return val;
            }
            val = new BTreeTransformBench_jmhType();
            Field f;
            f = org.apache.cassandra.test.microbench.btree.BTreeBench.class.getDeclaredField("dataSize");
            f.setAccessible(true);
            f.set(val, Integer.valueOf(control.getParam("dataSize")));
            f = org.apache.cassandra.test.microbench.btree.BTreeTransformBench.class.getDeclaredField("distribution");
            f.setAccessible(true);
            f.set(val, org.apache.cassandra.test.microbench.btree.BTreeTransformBench.Distribution.valueOf(control.getParam("distribution")));
            f = org.apache.cassandra.test.microbench.btree.BTreeTransformBench.class.getDeclaredField("ratio");
            f.setAccessible(true);
            f.set(val, Float.valueOf(control.getParam("ratio")));
            f = org.apache.cassandra.test.microbench.btree.BTreeTransformBench.class.getDeclaredField("uniquePerTrial");
            f.setAccessible(true);
            f.set(val, Boolean.valueOf(control.getParam("uniquePerTrial")));
            val.setup();
            val.setup();
            val.readyTrial = true;
            f_btreetransformbench0_G = val;
            } catch (Throwable t) {
                control.isFailing = true;
                throw t;
            }
        }
        return val;
    }
    
    BTreeBench_BuildSizeState_jmhType f_buildsizestate2_1;
    
    BTreeBench_BuildSizeState_jmhType _jmh_tryInit_f_buildsizestate2_1(InfraControl control, BTreeBench_jmhType l_btreebench3_G) throws Throwable {
        if (control.isFailing) throw new FailureAssistException();
        BTreeBench_BuildSizeState_jmhType val = f_buildsizestate2_1;
        if (val == null) {
            val = new BTreeBench_BuildSizeState_jmhType();
            val.setup(l_btreebench3_G);
            f_buildsizestate2_1 = val;
        }
        return val;
    }
    
    BTreeBench_BuildSizeState_jmhType f_buildsizestate2_2;
    
    BTreeBench_BuildSizeState_jmhType _jmh_tryInit_f_buildsizestate2_2(InfraControl control, BTreeBench_jmhType l_btreebench3_G) throws Throwable {
        if (control.isFailing) throw new FailureAssistException();
        BTreeBench_BuildSizeState_jmhType val = f_buildsizestate2_2;
        if (val == null) {
            val = new BTreeBench_BuildSizeState_jmhType();
            val.setup(l_btreebench3_G);
            f_buildsizestate2_2 = val;
        }
        return val;
    }
    
    BTreeTransformBench_ThreadState_jmhType f_threadstate1_0;
    
    BTreeTransformBench_ThreadState_jmhType _jmh_tryInit_f_threadstate1_0(InfraControl control, BTreeTransformBench_jmhType l_btreetransformbench0_G, BTreeBench_BuildSizeState_jmhType l_buildsizestate2_1, BTreeBench_BuildSizeState_jmhType l_buildsizestate2_2) throws Throwable {
        if (control.isFailing) throw new FailureAssistException();
        BTreeTransformBench_ThreadState_jmhType val = f_threadstate1_0;
        if (val == null) {
            val = new BTreeTransformBench_ThreadState_jmhType();
            val.doTrialSetup(l_btreetransformbench0_G,l_buildsizestate2_1);
            f_threadstate1_0 = val;
        }
        return val;
    }


}


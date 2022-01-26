#include <jni.h>
#include <string>
#include <cpuinfo.h>

#define PID com_lukasanda_nativecpuinfo_NativeCPUInfo // Java package name and class name. Don't forget to update when you copy this code.
#define MAKE_JNI_FUNCTION(r, n, p) extern "C" JNIEXPORT r JNICALL Java_ ## p ## _ ## n
#define JNI_CALL(r, n, p) MAKE_JNI_FUNCTION(r, n, p)
#define JNI(r, n) JNI_CALL(r, n, PID)

//#define LOGI(...) \
//  ((void)__android_log_print(ANDROID_LOG_INFO, "cpuinfo-libs::", __VA_ARGS__))

extern "C" JNIEXPORT void JNICALL
Java_com_lukasanda_nativecpuinfo_NativeCPUInfo_initLibrary(JNIEnv *env, jobject obj) {
  if (!cpuinfo_initialize()) {
//    LOGI("Error during initialization");
  }
}

JNI(jboolean, hasARMNeon)(JNIEnv *env, jobject obj) {
    if(!cpuinfo_initialize()) {
        return false;
    }
    return cpuinfo_has_arm_neon();
}

JNI(jboolean, blah)(JNIEnv *env, jobject obj) {
    if(!cpuinfo_initialize()) {
        return false;
    }

    return cpuinfo_has_x86_3dnow_plus()
}

JNI(jstring, getCpuName)(JNIEnv *env, jobject obj) {
    if (!cpuinfo_initialize()) {
        return env->NewStringUTF("");
    }
    return env->NewStringUTF(cpuinfo_get_package(0)->name);
}

jintArray get_cache_info(JNIEnv *env, uint32_t cacheCount, const cpuinfo_cache* cache) {
    if(cacheCount == 0) {
        return nullptr;
    }

    jintArray result = env->NewIntArray(cacheCount);
    jint internalArray[cacheCount];
    auto l1dCaches = cache;
    for (uint32_t i = 0; i < cacheCount; ++i) {
        internalArray[i] = l1dCaches[i].size;
    }
    env->SetIntArrayRegion(result, 0, cacheCount, internalArray);
    return result;
}

JNI(jintArray, getL1dCaches)(JNIEnv *env, jobject obj) {
    if(!cpuinfo_initialize()) {
        return nullptr;
    }

    return get_cache_info(env, cpuinfo_get_l1d_caches_count(), cpuinfo_get_l1d_caches());
}

JNI(jintArray, getL1iCaches)(JNIEnv *env, jobject obj) {
    if(!cpuinfo_initialize()) {
        return nullptr;
    }

    return get_cache_info(env, cpuinfo_get_l1i_caches_count(), cpuinfo_get_l1i_caches());
}

JNI(jintArray, getL2Caches)(JNIEnv *env, jobject obj) {
    if(!cpuinfo_initialize()) {
        return nullptr;
    }

    return get_cache_info(env, cpuinfo_get_l2_caches_count(), cpuinfo_get_l2_caches());
}

JNI(jintArray, getL3Caches)(JNIEnv *env, jobject obj) {
    if(!cpuinfo_initialize()) {
        return nullptr;
    }

    return get_cache_info(env, cpuinfo_get_l3_caches_count(), cpuinfo_get_l3_caches());
}

JNI(jintArray, getL4Caches)(JNIEnv *env, jobject obj) {
    if(!cpuinfo_initialize()) {
        return nullptr;
    }

    return get_cache_info(env, cpuinfo_get_l4_caches_count(), cpuinfo_get_l4_caches());
}

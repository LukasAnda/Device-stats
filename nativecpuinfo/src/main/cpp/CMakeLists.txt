cmake_minimum_required(VERSION 3.22.1)


project("nativecpuinfo")

include(ndk-pkg.cmake)

add_library(nativecpuinfo SHARED nativecpuinfo.cpp)
find_library(log-lib log)

target_link_libraries(nativecpuinfo ${log-lib} )

find_package(cpuinfo)
if (cpuinfo_FOUND)
    target_include_directories(nativecpuinfo PUBLIC ${CPUINFO_INCLUDE_DIR})
    target_link_libraries     (nativecpuinfo cpuinfo::libcpuinfo)
    target_link_libraries     (nativecpuinfo cpuinfo::libclog)
endif()
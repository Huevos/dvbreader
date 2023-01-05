SUMMARY = "Create *.so file to read data from DVB stream."
DESCRIPTION = "Create *.so file to read data from DVB stream."
MAINTAINER = "github.com/Huevos/dvbreader"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

inherit autotools-brokensep gitpkgv ${PYTHON_PN}targetconfig ${PYTHON_PN}native

SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
PR = "r0"

SRC_URI = "git://github.com/Huevos/dvbreader.git;protocol=https;branch=master"

EXTRA_OECONF = " \
    BUILD_SYS=${BUILD_SYS} \
    HOST_SYS=${HOST_SYS} \
    STAGING_INCDIR=${STAGING_INCDIR} \
    STAGING_LIBDIR=${STAGING_LIBDIR} \
    "

S = "${WORKDIR}/git"

INSANE_SKIP:${PN} += "already-stripped build-deps ldflags"

FILES:${PN}:append = " /usr"
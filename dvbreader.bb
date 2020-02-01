SUMMARY = "Reads data from dvb streams on enigma2 receivers."
DESCRIPTION = "Reads data from dvb streams on enigma2 receivers."
MAINTAINER = "Huevos"
PACKAGE_ARCH = "${MACHINE_ARCH}"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

inherit autotools-brokensep gitpkgv pythonnative gettext

SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
PR = "r0"

SRC_URI = "git://github.com/Huevos/dvbreader.git;protocol=git"

EXTRA_OECONF = " \
    BUILD_SYS=${BUILD_SYS} \
    HOST_SYS=${HOST_SYS} \
    STAGING_INCDIR=${STAGING_INCDIR} \
    STAGING_LIBDIR=${STAGING_LIBDIR} \
    "

S = "${WORKDIR}/git"

DEPENDS = "enigma2"

INSANE_SKIP_${PN} += "already-stripped ldflags"

FILES_${PN} += "${libdir}/*"

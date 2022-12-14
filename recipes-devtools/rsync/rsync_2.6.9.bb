require rsync.inc

SRC_URI += "file://rsync-2.6.9-fname-obo.patch \
            file://0001-Make-it-build-with-compile-time-hardening-enabled.patch \
            file://rsyncd.conf \
"

SRC_URI[md5sum] = "996d8d8831dbca17910094e56dcb5942"
SRC_URI[sha256sum] = "ca437301becd890e73300bc69a39189ff1564baa761948ff149b3dd7bde633f9"

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=6d5a9d4c4d3af25cd68fd83e8a8cb09c"

PR = "r4"

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'ipv6', d)}"

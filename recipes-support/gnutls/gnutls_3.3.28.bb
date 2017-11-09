require gnutls.inc

SRC_URI += " \
    file://configure.ac-fix-sed-command.patch \
    file://use-pkg-config-to-locate-zlib.patch \
"
SRC_URI[md5sum] = "e19718d97cee5279edf3f3b9318f926c"
SRC_URI[sha256sum] = "608f63441abc209c5bd5f61e35f2b6128c22e06fa2ad6248a08d8a643feeb807"

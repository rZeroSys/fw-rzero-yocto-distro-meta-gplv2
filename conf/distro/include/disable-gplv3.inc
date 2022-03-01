INCOMPATIBLE_LICENSE = '*GPLv3*'
WARN_QA:remove = 'incompatible-license'
RDEPENDS:${PN}-ptest:remove:pn-glib-2.0 = "python3-dbusmock"
DISTRO_FEATURES:remove = "ptest"

import {
	NativeModules
} from 'react-native';

const RNDownloadChecker = NativeModules.RNDownloadChecker;

const DownloadChecker = {

	verifyInstallerId() {
		return RNDownloadChecker.verifyInstallerId();
	},
};

module.exports = DownloadChecker;
